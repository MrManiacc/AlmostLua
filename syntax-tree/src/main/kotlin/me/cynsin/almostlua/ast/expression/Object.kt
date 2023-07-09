package me.cynsin.almostlua.ast.expression

import me.cynsin.almostlua.ast.data.Attributes
import me.cynsin.almostlua.ast.data.Block

data class Object(val name: Identifier, val attributes: Attributes, val body: Block? = null) : Expression{
    override fun toString(): String {
        return "object($name, $attributes, $body)"
    }
}