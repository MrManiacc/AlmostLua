package me.cynsin.almostlua.visitor.expression

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.expression.BinaryOp
import me.cynsin.almostlua.ast.expression.Expression
import me.cynsin.almostlua.ast.expression.Identifier
import me.cynsin.almostlua.ast.expression.Member
import me.cynsin.almostlua.visitor.Visitor

class ExpressionVisitor(private val visitor: Visitor) : AlmostLuaParserBaseVisitor<Expression>() {
    private val binaryOpVisitor = BinaryOpVisitor(visitor)
    private val memberVisitor = MemberVisitor(visitor)
    private val literalVisitor = LiteralVisitor(visitor)
    private val callVisitor = CallVisitor(visitor)
    private val objectVisitor = ObjectVisitor(visitor)


    override fun visitBinaryOperator(ctx: AlmostLuaParser.BinaryOperatorContext): Expression =
        binaryOpVisitor.visitBinaryOperator(ctx)

    override fun visitIdentifierExpression(ctx: AlmostLuaParser.IdentifierExpressionContext): Expression =
        Identifier(ctx.identifier().text)


    override fun visitMemberExpression(ctx: AlmostLuaParser.MemberExpressionContext): Expression =
        memberVisitor.visitMemberExpression(ctx)

    override fun visitLiteralExpression(ctx: AlmostLuaParser.LiteralExpressionContext): Expression =
        literalVisitor.visitLiteralExpression(ctx)

    override fun visitFunctionCallExpression(ctx: AlmostLuaParser.FunctionCallExpressionContext): Expression =
        callVisitor.visitFunctionCallExpression(ctx)

    override fun visitChunkObjectExpression(ctx: AlmostLuaParser.ChunkObjectExpressionContext): Expression =
        objectVisitor.visitChunkObjectExpression(ctx)

    override fun visitObjectExpression(ctx: AlmostLuaParser.ObjectExpressionContext): Expression =
        objectVisitor.visitObjectExpression(ctx)

    override fun visitAnonymousFunctionExpression(ctx: AlmostLuaParser.AnonymousFunctionExpressionContext): Expression =
        visitor.functionVisitor.visitAnonymousFunction(ctx.anonymousFunction())
}