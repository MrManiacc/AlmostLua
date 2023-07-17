package me.cynsin.almostlua.parser.expression

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.data.Attributes
import me.cynsin.almostlua.ast.expression.Identifier
import me.cynsin.almostlua.ast.expression.Object
import me.cynsin.almostlua.parser.ChunkParser

data class ObjectVisitor(private val visitor: ChunkParser) : AlmostLuaParserBaseVisitor<Object>() {
    override fun visitChunkObjectExpression(ctx: AlmostLuaParser.ChunkObjectExpressionContext): Object {
        val name = ctx.chunkObject().name.Name().text
        val attributes = if (ctx.chunkObject().attributes() != null) ctx.chunkObject().attributes()
            .accept(visitor.attributesVisitor) else Attributes.EMPTY
        val body = ctx.chunkObject().block()?.accept(visitor.blockVisitor)
        return Object(Identifier(name), attributes, body)
    }

    override fun visitObjectExpression(ctx: AlmostLuaParser.ObjectExpressionContext): Object {
        val name = ctx.`object`().name.Name().text
        val attributes =
            if (ctx.`object`().attributes() != null) ctx.`object`().attributes().accept(visitor.attributesVisitor)
            else Attributes.EMPTY
        return Object(Identifier(name), attributes)
    }
}