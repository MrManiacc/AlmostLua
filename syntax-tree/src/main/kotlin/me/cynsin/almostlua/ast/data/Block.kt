package me.cynsin.almostlua.ast.data

import me.cynsin.almostlua.ast.statement.Return
import me.cynsin.almostlua.ast.statement.Statement

data class Block(val statements: List<Statement>, val returnStatement: Statement = Return.VOID) : Statement {
    override fun toString(): String {
        return "block({\n\t${statements.joinToString(",\n\t")}},\n $returnStatement)"
    }
}