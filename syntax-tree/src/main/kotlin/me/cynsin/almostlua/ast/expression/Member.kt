package me.cynsin.almostlua.ast.expression

/**
 * Represents a member expression
 */
data class Member(val key: Expression, val value: Expression) : Expression {
    override fun toString(): String {
        return "$key.$value"
    }
}