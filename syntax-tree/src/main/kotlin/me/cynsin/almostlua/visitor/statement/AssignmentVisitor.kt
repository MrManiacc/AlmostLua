package me.cynsin.almostlua.visitor.statement

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.statement.Assignment
import me.cynsin.almostlua.visitor.Visitor

class AssignmentVisitor(private val visitor: Visitor) : AlmostLuaParserBaseVisitor<Assignment>() {
    override fun visitAssignment(ctx: AlmostLuaParser.AssignmentContext): Assignment {
        val left = ctx.left ?: throw IllegalStateException("Left side of assignment is null")
        val right = ctx.right ?: throw IllegalStateException("Right side of assignment is null")
        val leftExprs = left.expression().map { it.accept(visitor.expressionVisitor) }
        val rightExprs = right.accept(visitor.expressionVisitor)
        return Assignment(leftExprs, rightExprs)
    }
}
