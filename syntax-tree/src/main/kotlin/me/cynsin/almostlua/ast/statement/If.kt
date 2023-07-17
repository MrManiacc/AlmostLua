package me.cynsin.almostlua.ast.statement

import me.cynsin.almostlua.ast.data.Block
import me.cynsin.almostlua.ast.expression.Expression
import java.lang.StringBuilder

data class If(val condition: Expression, val body: Block, val elseBody: Block?) : Statement {
    override fun dump(indent: Int, stringBuilder: StringBuilder): StringBuilder {
        stringBuilder.append("\t".repeat(indent)).append("+ If").append("\n")
        condition.dump(indent + 1, stringBuilder)
            .append("\n")
        body.dump(indent + 1, stringBuilder)
        elseBody?.dump(indent + 1, stringBuilder)
        return stringBuilder
    }

    override val hasChildren: Boolean
        get() = true

    override fun toString(): String {
        return "HasElse = ${elseBody != null}"
    }
}