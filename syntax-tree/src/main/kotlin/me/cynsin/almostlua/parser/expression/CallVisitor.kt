package me.cynsin.almostlua.parser.expression

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.data.Attributes
import me.cynsin.almostlua.ast.expression.Call
import me.cynsin.almostlua.ast.expression.Identifier
import me.cynsin.almostlua.parser.ChunkParser

data class CallVisitor(private val visitor: ChunkParser) : AlmostLuaParserBaseVisitor<Call>() {
    override fun visitFunctionCallExpression(ctx: AlmostLuaParser.FunctionCallExpressionContext): Call {
        val function = ctx.identifier().Name().text ?: throw IllegalStateException("Function of function call is null")
        if (ctx.attributes() != null) {
            val attributes = ctx.attributes().accept(visitor.attributesVisitor)
            return Call(Identifier(function), attributes)
        }
        return Call(Identifier(function), Attributes.EMPTY)
    }

}