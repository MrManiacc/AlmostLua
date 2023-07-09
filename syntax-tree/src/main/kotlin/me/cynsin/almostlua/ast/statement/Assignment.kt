package me.cynsin.almostlua.ast.statement

import me.cynsin.almostlua.ast.expression.Expression

data class Assignment(val assignees: List<Expression>, val value: Expression) : Statement {
    override fun toString(): String {
        return "assignment(${assignees.joinToString(",")}, $value)"
    }
}