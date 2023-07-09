package me.cynsin.almostlua.ast.statement

import me.cynsin.almostlua.ast.data.Attributes

data class Return(val attributes: Attributes) : Statement {
    override fun toString(): String {
        return "return(${if (!attributes.isEmpty) attributes.joinToString(", ") else "void"})"
    }

    companion object {
        val VOID = Return(Attributes.EMPTY)
    }
}