package me.cynsin.almostlua.ast.data

import me.cynsin.almostlua.ast.expression.Expression

/**
 * A list of attributes, can be indexed by name or index
 */
data class Attributes(
    private val expressions: List<Expression> = emptyList(),
    private val namedExpressions: Map<String, Expression> = emptyMap()
) : Iterable<Expression> {
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

    val isEmpty get() = expressions.isEmpty() && namedExpressions.isEmpty()

    companion object {
        val EMPTY = Attributes(emptyList())
    }
}