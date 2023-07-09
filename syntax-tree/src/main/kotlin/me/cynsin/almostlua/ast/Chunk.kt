package me.cynsin.almostlua.ast

import me.cynsin.almostlua.ast.data.Block

/**
 * A luaLike chunk that contains a list of statements
 */
data class Chunk(val block: Block) {
    override fun toString(): String {
        return "chunk($block)"
    }
}