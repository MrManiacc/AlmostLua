package me.cynsin.almostlua.ast

import me.cynsin.almostlua.visitor.AstVisitor
import java.lang.StringBuilder

interface Node {
    fun accept(visitor: AstVisitor) = visitor.visit(this)

    fun dump(indent: Int, stringBuilder: StringBuilder) = stringBuilder.append(this)

    val hasChildren: Boolean get() = false
}