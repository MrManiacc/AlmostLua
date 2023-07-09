package me.cynsin.almostlua.visitor.expression

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.expression.Expression
import me.cynsin.almostlua.ast.expression.Member
import me.cynsin.almostlua.visitor.Visitor

data class MemberVisitor(private val visitor: Visitor) : AlmostLuaParserBaseVisitor<Member>() {
    override fun visitMemberExpression(ctx: AlmostLuaParser.MemberExpressionContext): Member {
        val left = ctx.left ?: throw IllegalStateException("Left side of member expression is null")
        val right = ctx.right ?: throw IllegalStateException("Right side of member expression is null")
        val leftExpression = left.accept(this)
        val rightExpression = right.accept(this)
        return Member(leftExpression, rightExpression)
    }

}