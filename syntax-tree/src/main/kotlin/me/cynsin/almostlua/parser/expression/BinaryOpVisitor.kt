package me.cynsin.almostlua.parser.expression

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.expression.BinaryOp
import me.cynsin.almostlua.parser.ChunkParser

data class BinaryOpVisitor(val visitor: ChunkParser): AlmostLuaParserBaseVisitor<BinaryOp> (){

    override fun visitBinaryOperatorExpression(ctx: AlmostLuaParser.BinaryOperatorExpressionContext): BinaryOp {
        val left = ctx.left ?: throw IllegalStateException("Left side of binary operator expression is null")
        val right = ctx.right ?: throw IllegalStateException("Right side of binary operator expression is null")
        val op = ctx.op?.text ?: throw IllegalStateException("Operator of binary operator expression is null")
        val leftExpression = left.accept(visitor.expressionVisitor)
        val rightExpression = right.accept(visitor.expressionVisitor)
        return BinaryOp(
            leftExpression,
            BinaryOp.Operator.values().find { it.identifier == op } ?: error("Failed to locate op '$op'"),
            rightExpression)
    }

}