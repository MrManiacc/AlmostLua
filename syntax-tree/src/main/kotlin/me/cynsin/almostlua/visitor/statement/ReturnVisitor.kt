package me.cynsin.almostlua.visitor.statement

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.data.Attributes
import me.cynsin.almostlua.ast.statement.Return
import me.cynsin.almostlua.visitor.Visitor

class ReturnVisitor(private val visitor: Visitor) : AlmostLuaParserBaseVisitor<Return>() {
    override fun visitReturn(ctx: AlmostLuaParser.ReturnContext): Return {
        return Return(ctx.attributes()?.accept(visitor.attributesVisitor) ?: Attributes.EMPTY)
    }
}