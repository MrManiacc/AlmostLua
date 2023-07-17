package me.cynsin.almostlua.ast.expression

import me.cynsin.almostlua.ast.data.Attributes
import java.lang.StringBuilder

data class Call(val functionName: Identifier, val arguments: Attributes) : Expression {
    override fun dump(indent: Int, stringBuilder: StringBuilder): StringBuilder {
        stringBuilder.append("\t".repeat(indent)).append("+ Call")
        functionName.dump(indent + 1, stringBuilder)
            .append("\n")
        arguments.dump(indent + 1, stringBuilder)
        return stringBuilder
    }

    override val hasChildren: Boolean
        get() = true

    override fun toString(): String {
        return "$functionName"
    }
}