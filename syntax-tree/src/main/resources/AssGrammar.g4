grammar AssGrammar;

script: expression+ EOF;

expression
    : 'self' #SelfExpression
    | primary #PrimaryExpression
    | return #ReturnExpression
    | accessor=expression '.' accessed=expression #MemberAccessExpression
    | expression '[' expression ']' #ElementAccessExpression
    | expression '(' (expression (',' expression)*)? ')' #InvocationExpression
    | expression op=('*' | '/' | '%') expression #MultiplicativeExpression
    | expression op=('+' | '-') expression #AdditiveExpression
    | expression op=('<' | '>' | '<=' | '>=' | '==' | '!=') expression #RelationalExpression
    | expression op=('&&' | '||') expression #LogicalExpression
    | expression op=('=' | '+=' | '-=' | '*=' | '/=' | '%=') expression #AssignmentExpression
    | expression '?' expression ':' expression #ConditionalExpression
    | expression op=('++' | '--') #PostfixExpression
    | op=('++' | '--') expression #PrefixExpression
    | expression op=('!' | '~' | '+' | '-') #UnaryExpression
    | expression op=('<<' | '>>' | '>>>' | '&' | '|' | '^') expression #BitwiseExpression
    | expression op=('in' | 'is') expression #TypeCheckExpression
    | expression op='as' expression #TypeCastExpression
    | expression op=('..' | '...') expression #RangeExpression
    | expression op=('and' | 'or') expression #LogicalExpression
    | expression op=('=>' | '->') expression #LambdaExpression
    | expression op='?:' expression #NullCoalescingExpression
    | '{' expression* returnVal=expression?'}' #TableExpression
    | '(' (Name (':' expression)?)* ')' #TableFieldExpression
    | expression op=('=' | '+=' | '-=' | '*=' | '/=' | '%=') expression #AssignmentExpression
    | 'if' expression 'then' expression ('else' expression)? #IfExpression
    ;

return: ('gtg' | 'break' | 'return')  value=expression?;

primary: literal | Name | '(' expression ')';

literal: nullLiteral | booleanLiteral | numericLiteral | stringLiteral | charLiteral;

nullLiteral: 'null';

booleanLiteral: 'true' | 'false';

numericLiteral: floatingPointLiteral | integerLiteral;

floatingPointLiteral:  hexadecimalFloatingPointLiteral | decimalFloatingPointLiteral;

decimalFloatingPointLiteral: ('0' | DIGIT+) '.' DIGIT* (exponentPart)? (floatTypeSuffix)?;

exponentPart: ('e' | 'E') ('+' | '-')? DIGIT+;

floatTypeSuffix: 'f' | 'F' | 'd' | 'D';

hexadecimalFloatingPointLiteral: hexadecimalPrefix hexadecimalDigits ('.' hexadecimalDigits)? hexadecimalExponentPart? (floatTypeSuffix)?;

hexadecimalPrefix: '0x' | '0X';

hexadecimalDigits: hexadecimalDigit+;

hexadecimalDigit: DIGIT | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';

hexadecimalExponentPart: ('p' | 'P') ('+' | '-')? DIGIT+;

integerLiteral: decimalIntegerLiteral | hexadecimalIntegerLiteral;

decimalIntegerLiteral: DIGIT+;

hexadecimalIntegerLiteral: hexadecimalPrefix hexadecimalDigits;

stringLiteral: STRING;

charLiteral: CHAR;



// Names are used for variables, functions, table fields, and more.
// E.g., local x = 1
Name : [a-zA-Z_][a-zA-Z_0-9]*;

// Strings are surrounded by single or double quotes.

STRING : '"' (ESC | ~["\\])* '"'
    | '\'' (ESC | ~['\\])* '\''
    ;

fragment ESC : '\\' [btnfr"'\\] ;

// Characters are surrounded by single quotes.

CHAR : '\'' (ESC | ~['\\])* '\''
    ;

// Comments start with a double hyphen and go until the end of the line.

COMMENT : '--' ~[\r\n]* -> skip;

// Whitespace is ignored.

WS : [ \t\r\n]+ -> skip;

// Digits are used for numbers.

DIGIT : [0-9];

// Keywords are used to identify the structure of the language.

