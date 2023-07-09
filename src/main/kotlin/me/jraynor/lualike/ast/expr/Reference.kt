package me.jraynor.lualike.ast.expr


interface Variable : Expression {
    val name: String
}


data class TableVariable(val table: Variable, val key: Expression) : Variable {
    override val name: String = "${table.name}[${key}]"
}

data class QualifiedVariable(val path: List<String>) : Variable {
    constructor(vararg path: String) : this(path.toList())

    override val name: String = path.joinToString { "." }
}