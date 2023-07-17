package me.cynsin.almostlua.ast.expression

import me.cynsin.almostlua.ast.data.Block
import java.lang.StringBuilder

data class Function(
    val parameters: List<Identifier>,
    val body: Block,
    val name: Identifier
) : Expression {

    override fun dump(indent: Int, stringBuilder: StringBuilder): StringBuilder {
        stringBuilder.append("\t".repeat(indent)).append("+ Function").append("\n")
        name.dump(indent + 1, stringBuilder)
            .append("\n")
        parameters.forEach { it.dump(indent + 1, stringBuilder) }
        body.dump(indent + 1, stringBuilder)
        return stringBuilder
    }

    override val hasChildren: Boolean
        get() = true

    override fun toString(): String {
        return name.toString()
    }
}