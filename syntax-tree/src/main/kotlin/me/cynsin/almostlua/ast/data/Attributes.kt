package me.cynsin.almostlua.ast.data

import me.cynsin.almostlua.ast.Node
import me.cynsin.almostlua.ast.expression.Expression
import me.cynsin.almostlua.visitor.AstVisitor
import java.lang.StringBuilder

/**
 * A list of attributes, can be indexed by name or index
 */
data class Attributes(
    private val expressions: List<Expression> = emptyList(),
    private val namedExpressions: Map<String, Expression> = emptyMap()
) : Iterable<Expression>, Node {
    operator fun get(index: Int) =
        expressions[index]

    operator fun get(name: String) = namedExpressions[name]

    //Iteraters through the expressions and namedExpressions
    override fun iterator(): Iterator<Expression> {
        return object : Iterator<Expression> {
            private var index = 0
            private val size = expressions.size + namedExpressions.size
            override fun hasNext() = index < size
            override fun next(): Expression {
                return if (index < expressions.size) {
                    expressions[index++]
                } else {
                    namedExpressions.values.elementAt(index++ - expressions.size)
                }
            }
        }
    }

    override fun accept(visitor: AstVisitor) = visitor.visit(this)

    override val hasChildren: Boolean
        get() = expressions.isNotEmpty() || namedExpressions.isNotEmpty()

    val isEmpty get() = expressions.isEmpty() && namedExpressions.isEmpty()
    override fun toString(): String =
        "${expressions.size + namedExpressions.size}"


    companion object {
        val EMPTY = Attributes(emptyList())
    }
}