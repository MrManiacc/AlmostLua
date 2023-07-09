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
    : ';' #EmptyStatement
    |  exp '=' explist #AssignmentStatement
    | label #LabelStatement
    | 'break' #BreakStatement
    | 'goto' NAME #GotoStatement
    | 'do' block 'end' #DoStatement
    | 'while' exp 'do' block 'end' #WhileStatement
    | 'repeat' block 'until' exp #RepeatStatement
    | 'if' exp 'then' block ('elseif' exp 'then' block)* ('else' block)? 'end' #IfStatement
    | 'for' NAME '=' exp COMMA exp (COMMA exp)? 'do' block 'end' #NumericForStatement
    | 'for' namelist 'in' explist 'do' block 'end' #GenericForStatement
    | 'function' funcname funcbody #FunctionStatement
    | 'local' 'function' NAME funcbody #LocalFunctionStatement
    | 'local' NAME attribList ('=' explist)? #LocalVariableDeclarationStatement
    |  exp #ExpressionStatement

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

object
    : '<' funcname objectAttributes?'>' block '<' '/' funcname  '>' #ObjectDeclaration
    | '<' funcname objectAttributes? '/' '>' #InlineObjectDeclaration
    ;

objectAttributes
    :  (functionObjectEntry (COMMA functionObjectEntry)*)
    ;

functionObjectEntry
    : reference '=' exp
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

reference
    : NAME attribList
    ;

exp
    : literalexp #LiteralExpression
    | functiondef #FunctionLiteral
    | reference #ReferenceExpression
    | exp '[' exp ']' #IndexExpression
    | exp '.' exp #MemberExpression
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
    | exp args #FunctionCallStatement
    | object #ObjectExpression
    ;


literalexp
    : NIL #NilLiteral
    | (TRUE | FALSE) #BooleanLiteral
    | number #NumberLiteral
    | string #StringLiteral
    | VARARGS #VarargsLiteral
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