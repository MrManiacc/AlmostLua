package me.cynsin.almostlua.ast.statement

import me.cynsin.almostlua.ast.data.Block
import me.cynsin.almostlua.ast.expression.Expression

data class If(val condition: Expression, val body: Block, val elseBody: Block?) : Statement{
    override fun toString(): String {
        return "if($condition) $body else $elseBody"
    }
}