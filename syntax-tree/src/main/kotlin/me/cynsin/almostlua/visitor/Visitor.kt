package me.cynsin.almostlua.visitor

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.Chunk
import me.cynsin.almostlua.visitor.expression.ExpressionVisitor
import me.cynsin.almostlua.visitor.expression.FunctionVisitor
import me.cynsin.almostlua.visitor.statement.StatementVisitor

class Visitor : AlmostLuaParserBaseVisitor<Chunk>() {
    val expressionVisitor = ExpressionVisitor(this)
    val statementVisitor = StatementVisitor(this)
    val functionVisitor = FunctionVisitor(this)
    val blockVisitor = BlockVisitor(this)
    val attributesVisitor = AttributesVisitor(this)

    override fun visitChunk(ctx: AlmostLuaParser.ChunkContext): Chunk {
        return Chunk(ctx.block().accept(blockVisitor))
    }


}

