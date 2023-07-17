package me.cynsin.almostlua.parser.expression

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.expression.Literal
import me.cynsin.almostlua.parser.ChunkParser

data class LiteralVisitor(private val visitor: ChunkParser) : AlmostLuaParserBaseVisitor<Literal>() {


    override fun visitBooleanLiteral(ctx: AlmostLuaParser.BooleanLiteralContext?): Literal {
        val text = ctx?.text ?: throw IllegalStateException("Boolean literal is null")
        return Literal(Literal.Type.Boolean, text.toBoolean())
    }

    override fun visitNilLiteral(ctx: AlmostLuaParser.NilLiteralContext?): Literal {
        return Literal(Literal.Type.Nil, Unit)
    }

    override fun visitIntLiteral(ctx: AlmostLuaParser.IntLiteralContext?): Literal {
        val text = ctx?.text ?: throw IllegalStateException("Int literal is null")
        return Literal(Literal.Type.Int, text.toInt())
    }

    override fun visitHexLiteral(ctx: AlmostLuaParser.HexLiteralContext?): Literal {
        val text = ctx?.text ?: throw IllegalStateException("Hex literal is null")
        return Literal(Literal.Type.Int, text.toInt(16))
    }

    override fun visitFloatLiteral(ctx: AlmostLuaParser.FloatLiteralContext?): Literal {
        val text = ctx?.text ?: throw IllegalStateException("Float literal is null")
        return Literal(Literal.Type.Float, text.toDouble())
    }

    override fun visitHexFloatLiteral(ctx: AlmostLuaParser.HexFloatLiteralContext?): Literal {
        val text = ctx?.text ?: throw IllegalStateException("Hex float literal is null")
        return Literal(Literal.Type.Float, text.toDouble())
    }

    override fun visitStringLiteral(ctx: AlmostLuaParser.StringLiteralContext?): Literal {
        val text = ctx?.text ?: throw IllegalStateException("String literal is null")
        return Literal(Literal.Type.String, text.substring(1, text.length - 1))
    }





}