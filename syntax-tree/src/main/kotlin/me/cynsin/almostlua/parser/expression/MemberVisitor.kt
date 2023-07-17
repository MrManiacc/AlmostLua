package me.cynsin.almostlua.parser.expression

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.expression.Member
import me.cynsin.almostlua.parser.ChunkParser

data class MemberVisitor(private val visitor: ChunkParser) : AlmostLuaParserBaseVisitor<Member>() {
    override fun visitMemberExpression(ctx: AlmostLuaParser.MemberExpressionContext): Member {
        val left = ctx.left ?: throw IllegalStateException("Left side of member expression is null ${ctx.text}")
        val right = ctx.right ?: throw IllegalStateException("Right side of member expression is null")
        val leftExpression = left.accept(visitor.expressionVisitor)
        val rightExpression = right.accept(visitor.expressionVisitor)
        return Member(leftExpression, rightExpression)
    }

}