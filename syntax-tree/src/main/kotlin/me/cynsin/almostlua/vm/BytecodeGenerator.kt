package me.cynsin.almostlua.vm

import me.cynsin.almostlua.ast.expression.*
import me.cynsin.almostlua.ast.expression.Function
import me.cynsin.almostlua.ast.statement.Assignment
import me.cynsin.almostlua.visitor.LoggingVisitor
import org.apache.logging.log4j.LogManager

class BytecodeGenerator : LoggingVisitor() {
    private val symbolTable = SymbolTable()
    private val log = LogManager.getLogger()
    private val bytecode = Bytecode.Builder()

    fun compile(source: Source): Bytecode {
        source.chunk.accept(this)
        return bytecode.build()
    }


    override fun visitBinaryOp(binaryOp: BinaryOp) {
        visit(binaryOp.left)
        visit(binaryOp.right)
        bytecode.binaryInst(binaryOp.operator)
    }

    override fun visitLiteral(literal: Literal) {
        when (literal.value) {
//        is Boolean -> bytecode.pushBoolean(literal.value)
            is Double -> bytecode.pushConstDoubleInst(literal.value)
            is String -> bytecode.pushConstStringInst(literal.value)
            is Int -> bytecode.pushConstIntInst(literal.value)
            is Float -> bytecode.pushConstFloatInst(literal.value)
            is Byte -> bytecode.pushConstByteInst(literal.value)
            is Short -> bytecode.pushConstShortInst(literal.value)
            else -> throw IllegalStateException("Unknown literal type: ${literal.value.javaClass}")
        }
    }

    override fun visitAssignment(assignment: Assignment) {
        if (assignment.assignees.size == assignment.values.size) {
            for (i in assignment.assignees.indices) {
                val value = assignment.values[i]
                val variable = assignment.assignees[i]
                visit(value)
                visit(variable)
                bytecode.storeInst()
            }
        }
    }

    override fun visitIdentifier(identifier: Identifier) {
        bytecode.loadInst(identifier.name)
    }

    override fun visitTable(expression: Table) {
        bytecode.initTableInst()
        if (expression.block != null) {
            visit(expression.block)
        }
    }

    override fun visitFunction(function: Function) {
        bytecode.pushFunctionInst(function)

    }
}