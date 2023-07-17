package me.cynsin.almostlua.visitor

import me.cynsin.almostlua.ast.*
import me.cynsin.almostlua.ast.data.Block
import me.cynsin.almostlua.ast.expression.*
import me.cynsin.almostlua.ast.expression.Function
import me.cynsin.almostlua.ast.statement.*
import org.apache.logging.log4j.LogManager

open class LoggingVisitor : AstVisitor {
    private val log = LogManager.getLogger()
    private var indentationLevel = 0
    private var isLastNodeStack = mutableListOf<Boolean>() // stack to track if node is last child of its parent

    private fun logAndIndent(node: Node, isLastChild: Boolean = false) {
        val prefix = generatePrefix(isLastChild)
        println("$prefix${node.javaClass.simpleName}: ($node)")
        if (node.hasChildren) { // you will have to implement this function
            isLastNodeStack.add(isLastChild)
            indentationLevel++
        }
    }

    private fun generatePrefix(isLastChild: Boolean): String {
        val prefix = StringBuilder()
        for (i in 1 until indentationLevel) {
            prefix.append(if (isLastNodeStack[i]) "   " else "│  ")
        }
        if (indentationLevel > 0) {
            prefix.append(if (isLastChild) "└──" else "├──")
        }
        return prefix.toString()
    }

    override fun visit(node: Node) {
        logAndIndent(node)
        super.visit(node)
        if (node.hasChildren) {
            indentationLevel--
            isLastNodeStack.removeAt(isLastNodeStack.lastIndex)
        }
    }


}