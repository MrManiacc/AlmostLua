parser grammar LuaLikeParser;

options {
  language = Java;
  tokenVocab = LuaLikeLexer;
}

chunk
    : block EOF
    ;

block
    : stat* laststat?
    ;

stat
    : ';'
    |  varlist '=' explist
    | functioncall
    | label
    | 'break'
    | 'goto' NAME
    | 'do' block 'end'
    | 'while' exp 'do' block 'end'
    | 'repeat' block 'until' exp
    | 'if' exp 'then' block ('elseif' exp 'then' block)* ('else' block)? 'end'
    | 'for' NAME '=' exp COMMA exp (COMMA exp)? 'do' block 'end'
    | 'for' namelist 'in' explist 'do' block 'end'
    | 'function' funcname funcbody
    | 'local' 'function' NAME funcbody
    | 'local' NAME attribList ('=' explist)?
    ;

attribList
    : ('<' varlist '>')?
    ;

laststat
    : 'return' explist? | 'break' | 'continue' ';'?
    ;

label
    : COLON_COLON NAME COLON_COLON
    ;

funcname
    : NAME (DOT NAME)* (COLON NAME)?
    ;

varlist
    : var (COMMA var)*
    ;

namelist
    : NAME (COMMA NAME)*
    ;

explist
    : (exp COMMA)* exp
    ;

exp
    : literalexp #LiteralExpression
    | functiondef #FunctionLiteral
    | prefixexp #PrefixExpression
    | tableconstructor #TableConstructor
    | <assoc=right> exp operatorPower exp #PowerExpression
    | operatorUnary exp #UnaryExpression
    | exp operatorMulDivMod exp #MulDivModExpression
    | exp operatorAddSub exp #AddSubExpression
    | <assoc=right> exp operatorStrcat exp #StrcatExpression
    | exp operatorComparison exp #ComparisonExpression
    | exp operatorAnd exp #AndExpression
    | exp operatorOr exp #OrExpression
    | exp operatorBitwise exp #BitwiseExpression
    ;


literalexp
    : NIL #NilLiteral
    | (TRUE | FALSE) #BooleanLiteral
    | number #NumberLiteral
    | string #StringLiteral
    | VARARGS #VarargsLiteral
    ;


prefixexp
    : varOrExp nameAndArgs*
    ;

functioncall
    : varOrExp nameAndArgs+
    ;

varOrExp
    : var | OPEN_PARENTHESES exp CLOSE_PARENTHESES
    ;

var
    : (NAME | OPEN_PARENTHESES exp CLOSE_PARENTHESES varSuffix) varSuffix*
    ;

varSuffix
    : nameAndArgs* ('[' exp ']' | '.' NAME)
    ;

nameAndArgs
    : (COLON NAME)? args
    ;

args
    : OPEN_PARENTHESES explist? CLOSE_PARENTHESES | tableconstructor | string
    ;

functiondef
    : FUNCTION funcbody
    ;

funcbody
    : OPEN_PARENTHESES parlist? CLOSE_PARENTHESES block 'end'
    ;

parlist
    : namelist (COMMA VARARGS)? | VARARGS
    ;

tableconstructor
    : '{' fieldlist? '}'
    ;

fieldlist
    : field (fieldsep field)* fieldsep?
    ;

field
    : '[' exp ']' '=' exp | NAME '=' exp | exp
    ;

fieldsep
    : COMMA | ';'
    ;

operatorOr
	: 'or';

operatorAnd
	: 'and';

operatorComparison
	: '<' | '>' | '<=' | '>=' | '~=' | '==';

operatorStrcat
	: '..';

operatorAddSub
	: '+' | '-';

operatorMulDivMod
	: '*' | '/' | '%' ;

operatorBitwise
	: '&' | '|' | '~' | '<<' | '>>';

operatorUnary
    : 'not' | '#' | '-' | '~';

operatorPower
    : '^';

number
    : INT | HEX | FLOAT | HEX_FLOAT
    ;

string
    : NORMALSTRING | CHARSTRING | LONGSTRING
    ;