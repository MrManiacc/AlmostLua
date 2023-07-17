package me.cynsin.almostlua.ast.expression

import java.lang.StringBuilder

data class BinaryOp(val left: Expression, val operator: Operator, val right: Expression) : Expression {


    override fun dump(indent: Int, stringBuilder: StringBuilder): StringBuilder {
        stringBuilder.append("\t".repeat(indent))
        left.dump(0, stringBuilder)
        stringBuilder.append(" ").append(operator).append(" ")
        right.dump(0, stringBuilder)
        return stringBuilder
    }

    override fun toString(): String {
        return "$operator"
    }

    override val hasChildren: Boolean
        get() = true

    enum class Operator(val identifier: String) {
        ADD("+"),
        SUB("-"),
        MUL("*"),
        DIV("/"),
        MOD("%"),
        POW("^"),
        CONCAT(".."),
        EQ("=="),
        NE("!="),
        LT("<"),
        LE("<="),
        GT(">"),
        GE(">="),
        AND("and"),
        OR("or")
    }
}