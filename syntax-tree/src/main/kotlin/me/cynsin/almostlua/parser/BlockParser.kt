package me.cynsin.almostlua.parser

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.data.Block
import me.cynsin.almostlua.ast.statement.Return

class BlockParser(private val visitor: ChunkParser) : AlmostLuaParserBaseVisitor<Block>() {
    override fun visitBlock(ctx: AlmostLuaParser.BlockContext): Block {
        val statements = ctx.statement().map {
            visitor.statementVisitor.visit(it)
        }
        if (statements.lastOrNull() is Return && ctx.return_() == null) return Block(statements.dropLast(1), statements.last())
        if (ctx.return_() == null && statements.isNotEmpty()) return Block(statements.dropLast(1), statements.last())
        val returnStatement = visitor.statementVisitor.visit(ctx.return_())
        return Block(statements, returnStatement)
    }
}