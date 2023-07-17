package me.cynsin.almostlua.ast.data

import me.cynsin.almostlua.ast.statement.Return
import me.cynsin.almostlua.ast.statement.Statement
import me.cynsin.almostlua.visitor.AstVisitor
import java.lang.StringBuilder

data class Block(val statements: List<Statement>, val returnStatement: Statement = Return.VOID) : Statement {


    override val hasChildren: Boolean
        get() = statements.isNotEmpty() || returnStatement != Return.VOID

    override fun toString(): String {
        return "Statements = ${statements.size}, Return = ${returnStatement != Return.VOID}"
    }
}