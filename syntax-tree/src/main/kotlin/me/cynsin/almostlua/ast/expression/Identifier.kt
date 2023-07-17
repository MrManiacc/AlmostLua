package me.cynsin.almostlua.ast.expression

import java.lang.StringBuilder

@JvmInline
value class Identifier(val name: String) : Expression {
    override fun toString(): String {
        return name
    }

    override fun dump(indent: Int, stringBuilder: StringBuilder): StringBuilder {
        stringBuilder.append("\t".repeat(indent)).append(" @ ")
            .append(name)
        return stringBuilder
    }
}