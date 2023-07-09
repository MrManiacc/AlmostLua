package me.cynsin.almostlua.ast.expression

@JvmInline
value class Identifier(val name: String) : Expression {
    override fun toString(): String {
        return name
    }
}