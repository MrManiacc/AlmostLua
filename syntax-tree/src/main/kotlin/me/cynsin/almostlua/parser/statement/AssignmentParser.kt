package me.cynsin.almostlua.parser.statement

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.statement.Assignment
import me.cynsin.almostlua.parser.ChunkParser

class AssignmentParser(private val visitor: ChunkParser) : AlmostLuaParserBaseVisitor<Assignment>() {
    override fun visitAssignment(ctx: AlmostLuaParser.AssignmentContext): Assignment {
        val left = ctx.left ?: throw IllegalStateException("Left side of assignment is null")
        val right = ctx.right ?: throw IllegalStateException("Right side of assignment is null")
        val leftExprs = left.expression().map { it.accept(visitor.expressionVisitor) }
        val rightExprs = right.expression().map { it.accept(visitor.expressionVisitor) }
        return Assignment(leftExprs, rightExprs)
    }
}
