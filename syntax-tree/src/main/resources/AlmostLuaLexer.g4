lexer grammar AlmostLuaLexer;

// A string that starts and ends with square brackets. These are used for multi-line strings or comments.
// E.g., [=[This is a string.]=]
LongString : '[' NestedStr ']';

fragment NestedStr : '=' NestedStr '=' | '[' .*? ']';

// Exponent parts are used in floating-point number literals to indicate scientific notation.
// E.g., in the number 1.23e-4, "e-4" is the ExponentPart.
fragment ExponentPart : [eE] [+-]? Digit+;
fragment HexExponentPart : [pP] [+-]? Digit+;

// Escape sequences are used in string literals to indicate special characters, like newlines (\n) or tabs (\t).
fragment EscapeSequence : '\\' [abfnrtvz"'|$#\\] | '\\' '\r'? '\n' | DecimalEscape | HexEscape | UtfEscape;
fragment DecimalEscape : '\\' Digit | '\\' Digit Digit | '\\' [0-2] Digit Digit;
fragment HexEscape : '\\' 'x' HexDigit HexDigit;
fragment UtfEscape : '\\' 'u{' HexDigit+ '}';

// Digits are used in number literals.
fragment Digit : [0-9];
fragment HexDigit : [0-9a-fA-F];
fragment SingleLineInputCharacter : ~[\r\n\u0085\u2028\u2029];

// Multi-line comments start with --[[ and end with --]].
// They are ignored by the parser, so they can be used to add notes or temporarily disable code.
// E.g., --[[ This is a comment. ]]
Comment : '--[' NestedStr ']' -> channel(HIDDEN);

// Single line comments start with -- and continue to the end of the line.
// They are ignored by the parser, so they can be used to add brief notes next to your code.
// E.g., -- This is a comment
LineComment : '--' SingleLineInputCharacter* -> channel(HIDDEN);

// Parentheses are used for grouping in expressions and to define the parameters and body of a function.
// E.g., (1 + 2) * 3, or function(x, y) return x + y end
LParen : '(';
RParen : ')';

// The colon is used to define methods in tables.
// E.g., function table:method() end
Colon : ':';

// The function keyword is used to define new functions.
// E.g., function() end
Function : 'function';

// The comma is used to separate items in a list, such as function arguments or table fields.
// E.g., local x, y = 1, 2
Comma : ',';

// The varargs symbol (...) is used to indicate that a function can take any number of arguments.
// E.g., function(...) end
Varargs : '...';

// The nil keyword represents the absence of a value.
// E.g., local x = nil
Nil : 'nil';

// The true and false keywords represent boolean values.
// E.g., local x = true, y = false
True : 'true' | 'True';
False : 'false' | 'False';

// The dot operator is used for table field access or for decimal numbers.
// E.g., local x = table.field or local x = 0.5
Dot: '.';

// The double colon operator is used to create labels for goto statements.
// E.g., ::label::
ColonColon : '::';

// The break keyword is used to exit a loop early.
// E.g., while true do if condition then break end end
Break : 'break' | 'Break';

// The goto keyword is used with a label to jump to that point in the code.
// E.g., goto label
Goto : 'goto';

// The do keyword is used to start a block of code.
// E.g., while condition do end
Do : 'do';

// The end keyword is used to close a block of code.
// E.g., while condition do end
End : 'end';

// Semi-colons can be used to separate statements.
// E.g., local x = 1; local y = 2
Semi : ';';

// The equals sign is used for assignment.
// E.g., local x = 1
Assign : '=';

// The while keyword is used to start a loop that continues as long as a condition is true.
// E.g., while condition do end
While : 'while';

// The repeat keyword is used to start a loop that continues until a condition becomes true.
// E.g., repeat until condition
Repeat : 'repeat';

// The until keyword is used with repeat to specify the condition for ending the loop.
// E.g., repeat until condition
Until : 'until';

// The if keyword is used to start a conditional statement.
// E.g., if condition then end
If : 'if';

// The then keyword is used with if to start the block of code that runs when the condition is true.
// E.g., if condition then end
Then : 'then';

// The elseif keyword is used in a conditional statement to specify a new condition if the previous conditions were not met.
// E.g., if condition1 then elseif condition2 then end
ElseIf : 'elseif';

// The else keyword is used in a conditional statement to specify a block of code that runs if no previous conditions were met.
// E.g., if condition then else end
Else : 'else';

// The for keyword is used to start a loop that iterates over a range of numbers or over elements in a table.
// E.g., for i = 1, 10 do end
For : 'for';

// The in keyword is used with for to iterate over elements in a table.
// E.g., for key, value in pairs(table) do end
In : 'in';

// The local keyword is used to declare a variable with local scope.
// E.g., local x = 1
Local : 'local';

// The return keyword is used to specify the result of a function.
// E.g., return x + y, or -> x + y, or yield x + y
Return : 'return' | '->' | 'yield';

// The continue keyword is used to skip the rest of the current iteration of a loop.
// E.g., if condition then continue end
Continue : 'continue';

// The or keyword is used to perform a logical OR operation.
// E.g., if condition1 or condition2 then end
Or : 'or';

// The and keyword is used to perform a logical AND operation.
// E.g., if condition1 and condition2 then end
And: 'and';

// The not keyword is used to perform a logical NOT operation.
// E.g., if not condition then end
Not: 'not';

// The count operator (#) is used to get the length of a string or the number of elements in a table.
// E.g., local length = #string or local count = #table
Count: '#';

// The greater than operator is used to compare two values.
// E.g., if x > y then end
RBrace: '>';

// The less than operator is used to compare two values.
// E.g., if x < y then end
LBrace: '<';

// The string concatenation operator is used to combine two strings.
// E.g., local str = "Hello, " .. "world!"
StrConcat: '..';

// The bitwise XOR operator is used to perform a bitwise exclusive OR operation.
// E.g., local x = y ~ z
BitXor: '~';

// The not equal operator is used to compare two values for inequality.
// E.g., if x ~= y then end
NotEqual: '~=';

// The greater than or equal operator is used to compare two values.
// E.g., if x >= y then end
RBraceAssign: '>=';

// The less than or equal operator is used to compare two values.
// E.g., if x <= y then end
LBraceAssign: '<=';

// The equality operator is used to compare two values for equality.
// E.g., if x == y then end
EqualEqual: '==';

// The plus operator is used for addition.
// E.g., local x = y + z
Plus: '+';

// The minus operator is used for subtraction or to indicate a negative number.
// E.g., local x = y - z or local x = -y
Minus: '-';

// The multiply operator is used for multiplication.
// E.g., local x = y * z
Multiply: '*';

// The divide operator is used for division.
// E.g., local x = y / z
Divide: '/';

// The modulo operator is used to get the remainder of a division.
// E.g., local x = y % z
Modulo: '%';

// The power operator is used to raise a number to the power of another number.
// E.g., local x = y ^ z
Pow: '^';

// The bitwise AND operator is used to perform a bitwise AND operation.
// E.g., local x = y & z
BitAnd: '&';

// The bitwise OR operator is used to perform a bitwise inclusive OR operation.
// E.g., local x = y | z
BitOr: '|';

// The shift left operator is used to shift the bits of a number to the left.
// E.g., local x = y << z
ShiftLeft: '<<';

// The shift right operator is used to shift the bits of a number to the right.
// E.g., local x = y >> z
ShiftRight: '>>';

// Braces are used to define a table.
// E.g., local table = {x = 1, y = 2}
OpenBrace: '{';
CloseBrace: '}';

// Square brackets are used for table indexing.
// E.g., local value = table[x]
OpenSquareBracket: '[';
CloseSquareBracket: ']';

// Integers are a type of number.
// E.g., local x = 1
Int : Digit+;

// Hexadecimal numbers are a type of number in base 16.
// E.g., local x = 0x1F
Hex : '0' [xX] HexDigit+;

// Floating point numbers are a type of number with a decimal point.
// E.g., local x = 1.23
Float : Digit+ '.' Digit* ExponentPart? | '.' Digit+ ExponentPart? | Digit+ ExponentPart;

// Hexadecimal floating point numbers are a type of number in base 16 with a decimal point.
// E.g., local x = 0x1.FP3
HexFloat : '0' [xX] HexDigit+ '.' HexDigit* HexExponentPart? | '0' [xX] '.' HexDigit+ HexExponentPart? | '0' [xX] HexDigit+ HexExponentPart;

// Names are used for variables, functions, table fields, and more.
// E.g., local x = 1
Name : [a-zA-Z_][a-zA-Z_0-9]*;

// Normal strings are a type of string enclosed in double quotes.
// E.g., local str = "Hello, world!"
NormalString : '"' ( EscapeSequence | ~('\\'|'"') )* '"';

// Char strings are a type of string enclosed in single quotes.
// E.g., local str = 'Hello, world!'
CharString : '\'' ( EscapeSequence | ~('\''|'\\') )* '\'';

/* This whitespace (WS) rule allows the parser to skip over any whitespace characters such as spaces, tabs, and line breaks. This is important for the lexer to correctly identify distinct tokens. Without this rule, the lexer could potentially treat two separate tokens as a single token if there was no space between them. */
WS : [ \t\u000C\r\n]+ -> skip;

/* The Shebang line, often seen in scripting languages like Lua, Python, and Bash, is a line at the very start of a script file which indicates the interpreter which should be used to run the rest of the script. This is often seen in Unix-based systems to allow script files to be run as standalone executables. This line is usually ignored in Windows systems.
For example, a Lua file might start with '#!/usr/bin/env lua' to indicate that the script should be run with Lua. */
Shebang : '#' '!' SingleLineInputCharacter* -> channel(HIDDEN);
