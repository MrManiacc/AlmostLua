package me.cynsin.almostlua.parser

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.Chunk
import me.cynsin.almostlua.parser.expression.ExpressionVisitor
import me.cynsin.almostlua.parser.expression.FunctionVisitor
import me.cynsin.almostlua.parser.statement.StatementVisitor

class ChunkParser : AlmostLuaParserBaseVisitor<Chunk>() {
    val expressionVisitor = ExpressionVisitor(this)
    val statementVisitor = StatementVisitor(this)
    val functionVisitor = FunctionVisitor(this)
    val blockVisitor = BlockParser(this)
    val attributesVisitor = AttributesParser(this)

    override fun visitChunk(ctx: AlmostLuaParser.ChunkContext): Chunk {
        return Chunk(ctx.block().accept(blockVisitor))
    }


}

