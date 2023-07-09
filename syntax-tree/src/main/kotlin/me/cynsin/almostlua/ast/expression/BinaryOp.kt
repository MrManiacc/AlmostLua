package me.cynsin.almostlua.ast.expression

data class BinaryOp(val left: Expression, val operator: Operator, val right: Expression) : Expression {
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