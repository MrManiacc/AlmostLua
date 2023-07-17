package me.cynsin.almostlua.parser.expression

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.expression.Function
import me.cynsin.almostlua.ast.expression.Identifier
import me.cynsin.almostlua.parser.ChunkParser

class FunctionVisitor(private val visitor: ChunkParser) : AlmostLuaParserBaseVisitor<Function>() {

    override fun visitAnonymousFunction(ctx: AlmostLuaParser.AnonymousFunctionContext?): Function {
        val params = ctx?.parameterList()?.Name()?.map { Identifier(it.text) } ?: emptyList()
        val body = ctx?.block()?.accept(visitor.blockVisitor) ?: throw IllegalStateException("Body of anonymous function is null")
        return Function(params, body, Identifier("__anonymous__"))
    }

    override fun visitFunctionDeclaration(ctx: AlmostLuaParser.FunctionDeclarationContext?): Function {
        val name = ctx?.identifier()?.Name()?.text ?: throw IllegalStateException("Name of function declaration is null")
        val params = ctx.parameterList().Name().map { Identifier(it.text) }
        val body = ctx.block().accept(visitor.blockVisitor)
        return Function(params, body, Identifier(name))
    }
}