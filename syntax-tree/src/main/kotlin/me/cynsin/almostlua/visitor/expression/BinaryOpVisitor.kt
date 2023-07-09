package me.cynsin.almostlua.visitor.expression

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.expression.BinaryOp
import me.cynsin.almostlua.ast.expression.Expression
import me.cynsin.almostlua.visitor.Visitor

data class BinaryOpVisitor(val visitor: Visitor): AlmostLuaParserBaseVisitor<BinaryOp> (){

    override fun visitBinaryOperatorExpression(ctx: AlmostLuaParser.BinaryOperatorExpressionContext): BinaryOp {
        val left = ctx.left ?: throw IllegalStateException("Left side of binary operator expression is null")
        val right = ctx.right ?: throw IllegalStateException("Right side of binary operator expression is null")
        val op = ctx.op?.text ?: throw IllegalStateException("Operator of binary operator expression is null")
        val leftExpression = left.accept(this)
        val rightExpression = right.accept(this)
        return BinaryOp(
            leftExpression,
            BinaryOp.Operator.values().find { it.identifier == op } ?: error("Failed to locate op '$op'"),
            rightExpression)
    }

}