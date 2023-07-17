package me.cynsin.almostlua.visitor

import me.cynsin.almostlua.ast.Chunk
import me.cynsin.almostlua.ast.Node
import me.cynsin.almostlua.ast.data.Attributes
import me.cynsin.almostlua.ast.data.Block
import me.cynsin.almostlua.ast.expression.*
import me.cynsin.almostlua.ast.expression.Function
import me.cynsin.almostlua.ast.statement.*

interface AstVisitor {
    fun visit(node: Node) = when (node) {
        is Chunk -> visitChunk(node)
        is Block -> visitBlock(node)
        is Attributes -> visitAttributes(node)
        is Statement -> visitStatement(node)
        else -> null
    }


    fun visitBlock(block: Block) {
        block.statements.forEach { visit(it) }
        visit(block.returnStatement)
    }

    fun visitChunk(chunk: Chunk) {
        visit(chunk.block)
    }

    fun visitStatement(statement: Statement) = when (statement) {
        is Return -> visitReturn(statement)
        is Assignment -> visitAssignment(statement)
        is While -> visitWhile(statement)
        is If -> visitIf(statement)
        is Expression -> visitExpression(statement)
        else -> null
    }


    fun visitReturn(returnStatement: Return) {
        visit(returnStatement.attributes)
    }

    fun visitAttributes(attributes: Attributes) {
        attributes.forEach { visit(it) }
    }

    fun visitAssignment(assignment: Assignment) {
        if (assignment.assignees.size == assignment.values.size) {
            for (i in assignment.assignees.indices) {
                visit(assignment.assignees[i])
                visit(assignment.values[i])
            }
        } else if (assignment.values.size == 1) {
            for (i in assignment.assignees.indices) {
                visit(assignment.assignees[i])
                visit(assignment.values[0])
            }
        } else {
            throw IllegalStateException("Assignment has ${assignment.assignees.size} assignees and ${assignment.values.size} values")
        }
    }

    fun visitWhile(`while`: While) {
        visit(`while`.condition)
        visit(`while`.body)
    }

    fun visitIf(`if`: If) {
        visit(`if`.condition)
        visit(`if`.body)
        `if`.elseBody?.let { visit(it) }
    }


    fun visitExpression(expression: Expression) {
        when (expression) {
            is BinaryOp -> visitBinaryOp(expression)
            is Call -> visitCall(expression)
            is Function -> visitFunction(expression)
            is Identifier -> visitIdentifier(expression)
            is Literal -> visitLiteral(expression)
            is Member -> visitMember(expression)
            is Object -> visitObject(expression)
            is Table -> visitTable(expression)
            else -> throw IllegalStateException("Unknown expression type: ${expression.javaClass}")
        }
    }

    fun visitTable(expression: Table) {
        if (expression.block != null) {
            visit(expression.block)
        }
    }

    fun visitBinaryOp(binaryOp: BinaryOp) {
        visit(binaryOp.left)
        visit(binaryOp.right)
    }


    fun visitIdentifier(identifier: Identifier) = Unit

    fun visitCall(call: Call) {
        visit(call.functionName)
        visit(call.arguments)
    }

    fun visitFunction(function: Function) {
        visit(function.name)
        function.parameters.forEach { visit(it) }
        visit(function.body)
    }

    fun visitLiteral(literal: Literal) = Unit

    fun visitMember(member: Member) {
        visit(member.key)
        visit(member.value)
    }

    fun visitObject(`object`: Object) {
        visit(`object`.name)
        visit(`object`.attributes)
        `object`.body?.let { visit(it) }
    }

}
