package me.cynsin.almostlua.visitor

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.data.Block

 class BlockVisitor(private val visitor: Visitor) : AlmostLuaParserBaseVisitor<Block>() {
    override fun visitBlock(ctx: AlmostLuaParser.BlockContext): Block {
        val statements = ctx.statement().map {
            visitor.statementVisitor.visit(it)
        }
        if (ctx.return_() == null) return Block(statements)
        val returnStatement = visitor.statementVisitor.visit(ctx.return_())
        return Block(statements, returnStatement)
    }
}