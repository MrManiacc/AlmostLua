package me.cynsin.almostlua.ast.expression

import me.cynsin.almostlua.ast.data.Attributes

data class Call(val functionName: Identifier, val arguments: Attributes) : Expression {
    override fun toString(): String {
        return "$functionName($arguments)"
    }
}