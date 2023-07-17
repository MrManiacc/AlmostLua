package me.cynsin.almostlua.ast.expression

import me.cynsin.almostlua.ast.data.Attributes
import me.cynsin.almostlua.ast.data.Block
import java.lang.StringBuilder

data class Object(val name: Identifier, val attributes: Attributes, val body: Block? = null) : Expression {

    override fun dump(indent: Int, stringBuilder: StringBuilder): StringBuilder {
        stringBuilder.append("\t".repeat(indent)).append("+ Object").append("\n")
        name.dump(indent + 1, stringBuilder)
            .append("\n")
        attributes.dump(indent + 1, stringBuilder)
        body?.dump(indent + 1, stringBuilder)
        return stringBuilder
    }

    override val hasChildren: Boolean
        get() = true

    override fun toString(): String = "$name"
}