package me.cynsin.almostlua.vm

import me.cynsin.almostlua.ast.Node
import me.cynsin.almostlua.ast.expression.Expression
import me.cynsin.almostlua.ast.expression.Function
import me.cynsin.almostlua.ast.expression.Object
import kotlin.reflect.KClass

data class Scope(val enclosingScope: Scope?, val symbols: MutableMap<String, Symbol<*>> = mutableMapOf())

class SymbolTable {
    private val globalScope = Scope(null)
    private var currentScope = globalScope

    fun enterScope() {
        currentScope = Scope(currentScope)
    }

    fun exitScope() {
        currentScope = currentScope.enclosingScope ?: throw IllegalStateException("Cannot exit global scope")
    }

    fun define(symbol: Symbol<*>) {
        currentScope.symbols[symbol.name] = symbol
//        println("Defined ${symbol.name} as ${if (symbol is Symbol.VariableSymbol) symbol.value.toString() else symbol.type.simpleName}")
    }

    fun scoped(block: () -> Unit): Scope {
        enterScope()
        val scope = currentScope
        block()
        exitScope()
        return scope
    }


    fun <T : Node> resolve(type: KClass<T>, name: String): Symbol<T>? {
        var scope: Scope? = currentScope
        while (scope != null) {
            val symbol = scope.symbols[name]
            if (symbol != null) {
                if (symbol.type == type)
                    return symbol as Symbol<T>?
            }
            scope = scope.enclosingScope
        }
        return null
    }

    fun dump() {
        println("Symbol table:")
        dumpScope(globalScope)
    }

    private fun dumpScope(globalScope: Scope) {
        globalScope.symbols.forEach { (name, symbol) ->
            println("$name: ${symbol.type.simpleName}")
        }
        globalScope.enclosingScope?.let { dumpScope(it) }
    }


}


sealed class Symbol<T : Node>(val name: String, val type: KClass<T>) {
    class VariableSymbol(name: String, val value: Expression) : Symbol<Expression>(name, Expression::class)
    class TableSymbol(name: String) : Symbol<Object>(name, Object::class)
    class FunctionSymbol(name: String, val parameters: List<String>, scope: Scope) :
        Symbol<Function>(name, Function::class)
}