package me.cynsin.almostlua.parser.statement

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.statement.Statement
import me.cynsin.almostlua.parser.ChunkParser

class StatementVisitor(private val visitor: ChunkParser) : AlmostLuaParserBaseVisitor<Statement>() {
    private val assignmentVisitor = AssignmentParser(visitor)
    private val ifVisitor = IfVisitor(visitor)
    private val whileVisitor = WhileVisitor(visitor)
    private val returnVisitor = ReturnVisitor(visitor)

    override fun visitExpressionStatement(ctx: AlmostLuaParser.ExpressionStatementContext): Statement =
        ctx.expression().accept(visitor.expressionVisitor)

    override fun visitAssignmentStatement(ctx: AlmostLuaParser.AssignmentStatementContext): Statement =
        assignmentVisitor.visitAssignment(ctx.assignment())

    override fun visitIfStatement(ctx: AlmostLuaParser.IfStatementContext?): Statement =
        ifVisitor.visitIfStatement(ctx!!)

    override fun visitWhileStatement(ctx: AlmostLuaParser.WhileStatementContext): Statement =
        whileVisitor.visitWhileStatement(ctx)

    override fun visitReturnStatement(ctx: AlmostLuaParser.ReturnStatementContext): Statement =
        returnVisitor.visitReturn(ctx.return_())

    override fun visitFunctionStatement(ctx: AlmostLuaParser.FunctionStatementContext): Statement =
        visitor.functionVisitor.visitFunctionDeclaration(ctx.functionDeclaration())

}