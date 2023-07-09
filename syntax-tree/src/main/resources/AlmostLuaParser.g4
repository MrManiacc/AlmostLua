// The main parser grammar for an AlmostLua language.
parser grammar AlmostLuaParser;

// Sets the language to Java and the token vocabulary to the lexer grammar AlmostLuaLexer.
options {
  language = Java;
  tokenVocab = AlmostLuaLexer;
}

/**
 * The main rule of the parser grammar.
 * This rule represents the start of the program and it is composed of a block and end of file token.
 */
chunk : block EOF;

/**
 * This rule represents the block of code, which consists of zero or more statements, and an optional return statement.
 */
block : statement* return?;

/**
 * This rule represents a single statement in the block.
 * A statement could be one of the following:
 * - an 'If' statement,
 * - an assignment,
 * - a function declaration, or
 * - a while loop.
 */
statement
    : If cond=expression Then body=block (Else elseBody=block)? End #IfStatement
    | assignment #AssignmentStatement
    | functionDeclaration #FunctionStatement
    | While expression Do block End #WhileStatement
    | expression Semi? #ExpressionStatement
    | return #ReturnStatement
;

/**
 * This rule represents a function declaration, which could be one of the following:
 * - a function declaration with a parameter list, or
 * - a function declaration without a parameter list.
 */
functionDeclaration : Function identifier LParen parameterList? RParen block End;

/**
* This rule represents an anonymous function declaration, which could be one of the following:
* - an anonymous function declaration with a parameter list, or
* - an anonymous function declaration without a parameter list.
*/
anonymousFunction : Function LParen parameterList? RParen block End;

/**
 * This rule represents a list of parameters.
 * - a parameter list with a single parameter, or
 * - a parameter list with multiple parameters.
 */
parameterList : Name (Comma Name)*;

/**
 * This rule represents an assignment statement.
 * It's a list of one or more expressions, followed by an assignment operator and another list of expressions.
 * The assignment ends with an optional semicolon.
 */
assignment : left=expressions Assign right=expression Semi?;

/**
 * This rule represents a list of one or more expressions.
 * - an expression,
 * - a list of expressions separated by a comma.
 */
expressions : expression (Comma expression)*;

/**
 * This rule represents an object with an optional list of attributes.
 */
object: LBrace name=identifier attributes? Divide RBrace;

/**
 * This rule represents an attribute which consists of a name and an expression.
 */
attribute: identifier Assign expression;

/**
 * This rule represents a list of one or more attributes.
 */
attributeList: attribute (Comma attribute)*;

/**
 * This rule matches either parameter list or attribute list.
 * - a parameter list with a single parameter, or
 * - a parameter list with multiple parameters, or
 * - an attribute list with a single attribute, or
 * - an attribute list with multiple attributes.
 */

/**
 * This rule represents a return statement which contains an optional list of expressions and ends with an optional semicolon.
 */
return : Return (attributes)? Semi?;

/**
 * This rule represents a list of expressions.
 */
attributes
    : (expression (Comma expression)*) #unnamedAttributes
    | attributeList #namedAttributes;

/**
 * This rule represents an expression which could be either an object or a literal.
 * - an object expression,
 * - an identifier expression,
 * - a literal expression,
 * - an anonymous function expression,
 */
chunkObject: LBrace name=identifier attributes? RBrace block LBrace identifier Divide RBrace;

/**
 * This rule represents an expression which could be either an object or a literal.
 */
expression
    : identifier #IdentifierExpression
    | literal #LiteralExpression
    | anonymousFunction #AnonymousFunctionExpression
    | chunkObject #ChunkObjectExpression
    | left=expression Dot right=expression #MemberExpression
    | identifier LParen attributes? RParen #FunctionCallExpression
    | left=expression op=binaryOperator right=expression #BinaryOperatorExpression
    | object #ObjectExpression
;


/**
 * This rule represents a binary operator which could be one of the following:
 * - an 'or' operator,
 * - an 'and' operator,
 * - an 'or' assignment operator,
 * - an 'and' assignment operator,
 * - a 'not equal' operator,
 * - an 'equal' operator,
 * - a string concatenation operator,
 * - a plus operator,
 * - a minus operator,
 * - a multiplication operator,
 * - a division operator,
 * - a modulo operator, or
 * - a power operator.
*/
binaryOperator
    : Or
    | And
    | LBrace
    | LBraceAssign
    | RBrace
    | RBraceAssign
    | NotEqual
    | EqualEqual
    | StrConcat
    | Plus
    | Minus
    | Multiply
    | Divide
    | Modulo
    | Pow
;

/**
 * This rule represents a literal which could be a boolean value, a nil value, a string, or a numeric value.
 */
literal
    : (True | False) #BooleanLiteral
    | Nil            #NilLiteral
    | string         #StringLiteral
    | numeric        #NumericLiteral
;

/**
 * This rule represents a numeric literal which could be an integer, a hex value, a floating point number, or a hex floating point number.
 */
numeric
    : Int            #IntLiteral
    | Hex            #HexLiteral
    | Float          #FloatLiteral
    | HexFloat       #HexFloatLiteral
;

/**
 * This rule represents a string literal which could be a normal string, a long string, or a char string.
 */
string
    : NormalString   #NormalStringLiteral
    | LongString     #LongStringLiteral
    | CharString     #CharStringLiteral
;
/**
 * This is a special rule that matches any identifier that is not a keyword.
 * This rule is used to match identifiers in the lexer.
 */
identifier: Name;