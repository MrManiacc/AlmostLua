lexer grammar LuaLikeLexer;

LONGSTRING
    : '[' NESTED_STR ']'
    ;

fragment
NESTED_STR
    : '=' NESTED_STR '='
    | '[' .*? ']'
    ;


fragment
ExponentPart
    : [eE] [+-]? Digit+
    ;

fragment
HexExponentPart
    : [pP] [+-]? Digit+
    ;

fragment
EscapeSequence
    : '\\' [abfnrtvz"'|$#\\]   // World of Warcraft Lua additionally escapes |$#
    | '\\' '\r'? '\n'
    | DecimalEscape
    | HexEscape
    | UtfEscape
    ;

fragment
DecimalEscape
    : '\\' Digit
    | '\\' Digit Digit
    | '\\' [0-2] Digit Digit
    ;

fragment
HexEscape
    : '\\' 'x' HexDigit HexDigit
    ;

fragment
UtfEscape
    : '\\' 'u{' HexDigit+ '}'
    ;

fragment
Digit
    : [0-9]
    ;

fragment
HexDigit
    : [0-9a-fA-F]
    ;

fragment
SingleLineInputCharacter
    : ~[\r\n\u0085\u2028\u2029]
    ;

COMMENT
    : '--[' NESTED_STR ']' -> channel(HIDDEN)
    ;

LINE_COMMENT
    : '--' SingleLineInputCharacter* -> channel(HIDDEN)
    ;

OPEN_PARENTHESES
    : '('
    ;

CLOSE_PARENTHESES
    : ')'
    ;
COLON
    : ':'
    ;

FUNCTION
    : 'function'
    ;
COMMA
    : ','
    ;

VARARGS
    : '...'
    ;
NIL
    : 'nil'
    ;
TRUE
    : 'true'
    ;
FALSE
    : 'false'
    ;
DOT:
    '.'
    ;

COLON_COLON
    : '::'
    ;

BREAK
    : 'break'
    ;

GOTO
    : 'goto'
    ;

DO
    : 'do'
    ;

END
    : 'end'
    ;
SEMI
    : ';'
    ;

EQUALS
    : '='
    ;
WHILE
    : 'while'
    ;

REPEAT
    : 'repeat'
    ;

UNTIL
    : 'until'
    ;

IF
    : 'if'
    ;

THEN
    : 'then'
    ;

ELSEIF
    : 'elseif'
    ;

ELSE
    : 'else'
    ;
FOR
    : 'for'
    ;

IN
    : 'in'
    ;

LOCAL
    : 'local'
    ;

RETURN
    : 'return'
    ;
CONTINUE
    : 'continue'
    ;

OR
    : 'or'
    ;

AND:
    'and'
    ;

NOT:
    'not'
    ;

COUNT:
    '#'
    ;

GREATER_THAN:
    '>'
    ;

LESS_THAN:
    '<'
    ;

STR_CONCAT:
    '..'
    ;
BIT_XOR:
    '~'
    ;
NOT_EQUAL:
    '~='
    ;

GREATER_THAN_OR_EQUAL:
    '>='
    ;

LESS_THAN_OR_EQUAL:
    '<='
    ;

EQUAL_EQUAL:
    '=='
    ;

PLUS:
    '+'
    ;

MINUS:
    '-'
    ;

MULTIPLY:
    '*'
    ;

DIVIDE:
    '/'
    ;

MODULO:
    '%'
    ;

POW:
    '^'
    ;

BIT_AND:
    '&'
    ;

BIT_OR:
    '|'
    ;

SHIFT_LEFT:
    '<<'
    ;

SHIFT_RIGHT:
    '>>'
    ;



OPEN_BRACE:
    '{'
    ;

CLOSE_BRACE:
    '}'
    ;

OPEN_SQUARE_BRACKET:
    '['
    ;

CLOSE_SQUARE_BRACKET:
    ']'
    ;

INT
    : Digit+
    ;

HEX
    : '0' [xX] HexDigit+
    ;

FLOAT
    : Digit+ '.' Digit* ExponentPart?
    | '.' Digit+ ExponentPart?
    | Digit+ ExponentPart
    ;

HEX_FLOAT
    : '0' [xX] HexDigit+ '.' HexDigit* HexExponentPart?
    | '0' [xX] '.' HexDigit+ HexExponentPart?
    | '0' [xX] HexDigit+ HexExponentPart
    ;
NAME
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

NORMALSTRING
    : '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

CHARSTRING
    : '\'' ( EscapeSequence | ~('\''|'\\') )* '\''
    ;


WS
    : [ \t\u000C\r\n]+ -> skip
    ;

SHEBANG
    : '#' '!' SingleLineInputCharacter* -> channel(HIDDEN)
    ;

