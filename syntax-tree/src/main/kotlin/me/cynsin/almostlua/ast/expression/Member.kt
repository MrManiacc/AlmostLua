package me.cynsin.almostlua.ast.expression

/**
 * Represents a member expression
 */
data class Member(val left: Expression, val right: Expression) : Expression {
    override fun toString(): String {
        return "$left.$right"
    }
}