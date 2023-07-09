package me.cynsin.almostlua.ast.statement

import me.cynsin.almostlua.ast.data.Block
import me.cynsin.almostlua.ast.expression.Expression

data class While(val condition: Expression, val body: Block) : Statement {
    override fun toString(): String {
        return "while($condition) $body"
    }
}