package me.cynsin.almostlua.visitor.statement

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.statement.If
import me.cynsin.almostlua.visitor.Visitor

class IfVisitor(private val visitor: Visitor) : AlmostLuaParserBaseVisitor<If>() {
    override fun visitIfStatement(ctx: AlmostLuaParser.IfStatementContext): If {
        val cond = ctx.cond?.accept(visitor.expressionVisitor)
            ?: throw IllegalStateException("Condition of if statement is null")
        val body = ctx.body?.accept(visitor.blockVisitor) ?: throw IllegalStateException("Body of if statement is null")
        val elseBody = ctx.elseBody?.accept(visitor.blockVisitor)
        return If(cond, body, elseBody)
    }
}