// Generated from C:/Users/james/IdeaProjects/LuaLike/syntax-tree/src/main/resources\AlmostLuaParser.g4 by ANTLR 4.12.0
package me.cynsin.almostlua;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlmostLuaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlmostLuaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(AlmostLuaParser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AlmostLuaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link AlmostLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AlmostLuaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link AlmostLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(AlmostLuaParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionStatement}
	 * labeled alternative in {@link AlmostLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(AlmostLuaParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link AlmostLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AlmostLuaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionStatement}
	 * labeled alternative in {@link AlmostLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AlmostLuaParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link AlmostLuaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AlmostLuaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AlmostLuaParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunction(AlmostLuaParser.AnonymousFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AlmostLuaParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AlmostLuaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(AlmostLuaParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(AlmostLuaParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(AlmostLuaParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#attributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeList(AlmostLuaParser.AttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(AlmostLuaParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unnamedAttributes}
	 * labeled alternative in {@link AlmostLuaParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedAttributes(AlmostLuaParser.UnnamedAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedAttributes}
	 * labeled alternative in {@link AlmostLuaParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedAttributes(AlmostLuaParser.NamedAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#chunkObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunkObject(AlmostLuaParser.ChunkObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnonymousFunctionExpression}
	 * labeled alternative in {@link AlmostLuaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunctionExpression(AlmostLuaParser.AnonymousFunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberExpression}
	 * labeled alternative in {@link AlmostLuaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpression(AlmostLuaParser.MemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOperatorExpression}
	 * labeled alternative in {@link AlmostLuaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperatorExpression(AlmostLuaParser.BinaryOperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link AlmostLuaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(AlmostLuaParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChunkObjectExpression}
	 * labeled alternative in {@link AlmostLuaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunkObjectExpression(AlmostLuaParser.ChunkObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectExpression}
	 * labeled alternative in {@link AlmostLuaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpression(AlmostLuaParser.ObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link AlmostLuaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(AlmostLuaParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link AlmostLuaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(AlmostLuaParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(AlmostLuaParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link AlmostLuaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(AlmostLuaParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NilLiteral}
	 * labeled alternative in {@link AlmostLuaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilLiteral(AlmostLuaParser.NilLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link AlmostLuaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(AlmostLuaParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericLiteral}
	 * labeled alternative in {@link AlmostLuaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(AlmostLuaParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link AlmostLuaParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(AlmostLuaParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HexLiteral}
	 * labeled alternative in {@link AlmostLuaParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexLiteral(AlmostLuaParser.HexLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLiteral}
	 * labeled alternative in {@link AlmostLuaParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(AlmostLuaParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HexFloatLiteral}
	 * labeled alternative in {@link AlmostLuaParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexFloatLiteral(AlmostLuaParser.HexFloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalStringLiteral}
	 * labeled alternative in {@link AlmostLuaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalStringLiteral(AlmostLuaParser.NormalStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LongStringLiteral}
	 * labeled alternative in {@link AlmostLuaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongStringLiteral(AlmostLuaParser.LongStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharStringLiteral}
	 * labeled alternative in {@link AlmostLuaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharStringLiteral(AlmostLuaParser.CharStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlmostLuaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(AlmostLuaParser.IdentifierContext ctx);
}