package me.cynsin.almostlua.visitor.statement

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.statement.While
import me.cynsin.almostlua.visitor.Visitor

class WhileVisitor(private val visitor: Visitor): AlmostLuaParserBaseVisitor<While>() {
    override fun visitWhileStatement(ctx: AlmostLuaParser.WhileStatementContext): While {
        val cond = ctx.expression().accept(visitor.expressionVisitor)
        val body = ctx.block().accept(visitor.blockVisitor)
        return While(cond, body)
    }
}