package me.cynsin.almostlua

import me.cynsin.almostlua.ast.Chunk
import me.cynsin.almostlua.visitor.Visitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

object Tree {
    fun compile(source: String): Chunk {
        val lexer = AlmostLuaLexer(CharStreams.fromString(source))
        val parser = AlmostLuaParser(CommonTokenStream(lexer))
        val tree = parser.chunk()
        return Visitor().visitChunk(tree)
    }
}