package me.cynsin.almostlua.ast.expression

import me.cynsin.almostlua.ast.data.Block

data class Function(
    val parameters: List<Identifier>,
    val body: Block,
    val name: Identifier
) : Expression {
    override fun toString(): String {
        return "function($parameters) $body"
    }
}