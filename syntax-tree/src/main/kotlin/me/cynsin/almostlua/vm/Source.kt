package me.cynsin.almostlua.vm

import me.cynsin.almostlua.AlmostLuaLexer
import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.parser.ChunkParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.nio.file.Path

data class Source private constructor(private val commonTokenStream: CommonTokenStream, val name: String) {
    val chunk = ChunkParser().visitChunk(AlmostLuaParser(commonTokenStream).chunk())

    companion object {
        fun fromString(source: String, name: String = "<unknown>"): Source {
            val lexer = AlmostLuaLexer(CharStreams.fromString(source))
            val commonTokenStream = CommonTokenStream(lexer)
            return Source(commonTokenStream, name)
        }

        fun fromPath(path: Path, name: String = "<unknown>"): Source {
            val lexer = AlmostLuaLexer(CharStreams.fromPath(path))
            val commonTokenStream = CommonTokenStream(lexer)
            return Source(commonTokenStream, name)
        }

        fun fromFileName(fileName: String, name: String = "<unknown>"): Source {
            val lexer = AlmostLuaLexer(CharStreams.fromFileName(fileName))
            val commonTokenStream = CommonTokenStream(lexer)
            return Source(commonTokenStream, name)
        }

        fun fromInputStream(inputStream: java.io.InputStream, name: String = "<unknown>"): Source {
            val lexer = AlmostLuaLexer(CharStreams.fromStream(inputStream))
            val commonTokenStream = CommonTokenStream(lexer)
            return Source(commonTokenStream, name)
        }

        fun fromReader(reader: java.io.Reader, name: String = "<unknown>"): Source {
            val lexer = AlmostLuaLexer(CharStreams.fromReader(reader))
            val commonTokenStream = CommonTokenStream(lexer)
            return Source(commonTokenStream, name)
        }

        fun fromResource(fileName: String, name: String): Source {
            val inputStream = Source::class.java.getResourceAsStream("/$fileName")
            val lexer = AlmostLuaLexer(CharStreams.fromStream(inputStream))
            val commonTokenStream = CommonTokenStream(lexer)
            return Source(commonTokenStream, name)
        }
    }
}