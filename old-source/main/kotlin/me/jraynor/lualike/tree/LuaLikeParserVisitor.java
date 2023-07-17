// Generated from C:/Users/james/IdeaProjects/LuaLike/src/main/kotlin/me/jraynor/lualike/tree\LuaLikeParser.g4 by ANTLR 4.12.0
package me.jraynor.lualike.tree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LuaLikeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LuaLikeParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(LuaLikeParser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LuaLikeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(LuaLikeParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#attribList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribList(LuaLikeParser.AttribListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#laststat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLaststat(LuaLikeParser.LaststatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(LuaLikeParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(LuaLikeParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(LuaLikeParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#namelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamelist(LuaLikeParser.NamelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(LuaLikeParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExpression}
	 * labeled alternative in {@link LuaLikeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(LuaLikeParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link LuaLikeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(LuaLikeParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link LuaLikeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(LuaLikeParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableConstructor}
	 * labeled alternative in {@link LuaLikeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstructor(LuaLikeParser.TableConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link LuaLikeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(LuaLikeParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivModExpression}
	 * labeled alternative in {@link LuaLikeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModExpression(LuaLikeParser.MulDivModExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpression}
	 * labeled alternative in {@link LuaLikeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(LuaLikeParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link LuaLikeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(LuaLikeParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link LuaLikeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(LuaLikeParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionLiteral}
	 * labeled alternative in {@link LuaLikeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLiteral(LuaLikeParser.FunctionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrefixExpression}
	 * labeled alternative in {@link LuaLikeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(LuaLikeParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrcatExpression}
	 * labeled alternative in {@link LuaLikeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrcatExpression(LuaLikeParser.StrcatExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseExpression}
	 * labeled alternative in {@link LuaLikeParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseExpression(LuaLikeParser.BitwiseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NilLiteral}
	 * labeled alternative in {@link LuaLikeParser#literalexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilLiteral(LuaLikeParser.NilLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link LuaLikeParser#literalexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(LuaLikeParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link LuaLikeParser#literalexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(LuaLikeParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link LuaLikeParser#literalexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(LuaLikeParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarargsLiteral}
	 * labeled alternative in {@link LuaLikeParser#literalexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarargsLiteral(LuaLikeParser.VarargsLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#prefixexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixexp(LuaLikeParser.PrefixexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(LuaLikeParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#varOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrExp(LuaLikeParser.VarOrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LuaLikeParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#varSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSuffix(LuaLikeParser.VarSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#nameAndArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAndArgs(LuaLikeParser.NameAndArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(LuaLikeParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#functiondef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondef(LuaLikeParser.FunctiondefContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#funcbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncbody(LuaLikeParser.FuncbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#parlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParlist(LuaLikeParser.ParlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#tableconstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableconstructor(LuaLikeParser.TableconstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlist(LuaLikeParser.FieldlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(LuaLikeParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#fieldsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldsep(LuaLikeParser.FieldsepContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#operatorOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorOr(LuaLikeParser.OperatorOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#operatorAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAnd(LuaLikeParser.OperatorAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#operatorComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorComparison(LuaLikeParser.OperatorComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#operatorStrcat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorStrcat(LuaLikeParser.OperatorStrcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#operatorAddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAddSub(LuaLikeParser.OperatorAddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#operatorMulDivMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorMulDivMod(LuaLikeParser.OperatorMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#operatorBitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorBitwise(LuaLikeParser.OperatorBitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#operatorUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorUnary(LuaLikeParser.OperatorUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#operatorPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorPower(LuaLikeParser.OperatorPowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LuaLikeParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LuaLikeParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LuaLikeParser.StringContext ctx);
}