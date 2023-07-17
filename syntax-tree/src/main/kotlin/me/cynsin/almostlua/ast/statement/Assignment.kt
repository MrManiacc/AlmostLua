package me.cynsin.almostlua.ast.statement

import me.cynsin.almostlua.ast.expression.Expression

data class Assignment(val assignees: List<Expression>, val values: List<Expression>) : Statement {

    init {
        assert(assignees.size == values.size || values.size == 1)
    }


    override fun dump(indent: Int, stringBuilder: java.lang.StringBuilder): java.lang.StringBuilder {
        stringBuilder.append("\t".repeat(indent)).append("+ Assignment").append("\n")
        if (assignees.size == values.size) {
            for (i in assignees.indices) {
                assignees[i].dump(indent + 1, stringBuilder)
                stringBuilder.append("\n")
                values[i].dump(indent + 1, stringBuilder)
            }
        } else if (values.size == 1) {
            for (assignee in assignees) {
                assignee.dump(indent + 1, stringBuilder)
                values[0].dump(indent + 1, stringBuilder)
            }
        }
        return stringBuilder
    }

    override val hasChildren: Boolean
        get() = true

    override fun toString(): String {
        val sb = StringBuilder()
        if (assignees.size == 1) {
            sb.append(assignees[0])
        } else {
            sb.append("{")
            sb.append(assignees.joinToString(","))
            sb.append("}")
        }
        sb.append(" = ")
        if (values.size == 1) {
            sb.append(values[0])
        } else {
            sb.append("{")
            sb.append(values.joinToString(","))
            sb.append("}")
        }
        return "$sb"
    }
}