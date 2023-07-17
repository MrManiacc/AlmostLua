package me.cynsin.almostlua.ast.statement

import me.cynsin.almostlua.ast.data.Attributes
import java.lang.StringBuilder

data class Return(val attributes: Attributes) : Statement {
    override fun toString(): String {
        return if (!attributes.isEmpty) attributes.joinToString(", ") else "void"
    }

    override fun dump(indent: Int, stringBuilder: StringBuilder): StringBuilder {
        stringBuilder.append("\t".repeat(indent)).append("+ Return").append("\n")
        attributes.dump(indent + 1, stringBuilder)
        return stringBuilder
    }

    override val hasChildren: Boolean
        get() = !attributes.isEmpty

    companion object {
        val VOID = Return(Attributes.EMPTY)
    }
}