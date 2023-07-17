package me.cynsin.almostlua.ast.expression

import me.cynsin.almostlua.ast.data.Block

data class Table(val block: Block?) : Expression {
    override val hasChildren: Boolean
        get() = block != null


    override fun toString(): String = "Table"
}