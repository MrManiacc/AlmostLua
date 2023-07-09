package me.cynsin.almostlua.visitor

import me.cynsin.almostlua.AlmostLuaParser
import me.cynsin.almostlua.AlmostLuaParserBaseVisitor
import me.cynsin.almostlua.ast.data.Attributes

data class AttributesVisitor(private val visitor: Visitor) : AlmostLuaParserBaseVisitor<Attributes>() {


    override fun visitUnnamedAttributes(ctx: AlmostLuaParser.UnnamedAttributesContext): Attributes {
        return Attributes(expressions = ctx.expression().map { it.accept(visitor.expressionVisitor) })
    }

    override fun visitNamedAttributes(ctx: AlmostLuaParser.NamedAttributesContext): Attributes {
        return Attributes(namedExpressions = ctx.attributeList().attribute()
            .associate { it.identifier().Name().text to it.expression().accept(visitor.expressionVisitor) })
    }


}