package me.cynsin.almostlua.ast

import me.cynsin.almostlua.ast.data.Block
import me.cynsin.almostlua.visitor.AstVisitor
import java.lang.StringBuilder

/**
 * A luaLike chunk that contains a list of statements
 */
data class Chunk(val block: Block) : Node {

    override fun dump(indent: Int, stringBuilder: StringBuilder): StringBuilder {
        stringBuilder.append("\t".repeat(indent)).append("+ Chunk").append("\n")
        block.dump(indent + 1, stringBuilder)
        return stringBuilder
    }

    override val hasChildren: Boolean
        get() = block.hasChildren

    override fun toString(): String {
        return "$block"
    }
}