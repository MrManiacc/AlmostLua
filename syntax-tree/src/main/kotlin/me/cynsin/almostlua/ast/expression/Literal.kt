package me.cynsin.almostlua.ast.expression

import java.lang.StringBuilder

data class Literal(val type: Type, val value: Any) : Expression {

    override fun toString(): String {
        return when (type) {
            Type.Nil -> "nil"
            Type.Boolean -> value.toString()
            Type.Float -> value.toString()
            Type.String -> "\"$value\""
            Type.Int -> value.toString()
            Type.Hex -> "0x${asInt?.toString(16)}"
            Type.HexFloat -> "0x${asFloat?.toString()}"
        }
    }

    val asNil: Unit? = null

    val asBoolean: Boolean?
        get() = when (type) {
            Type.Boolean -> value as Boolean
            else -> null
        }

    val asFloat: Float?
        get() = when (type) {
            Type.Float -> if (value is Number) value.toFloat() else null
            else -> null
        }

    val asDouble: Double?
        get() = when (type) {
            Type.Float -> if (value is Number) value.toDouble() else null
            else -> null
        }

    val asInt: Int?
        get() = when (type) {
            Type.Float -> if (value is Number) value.toInt() else null
            else -> null
        }

    val asString: String?
        get() = when (type) {
            Type.String -> value as String
            else -> null
        }

    override fun dump(indent: Int, stringBuilder: StringBuilder): StringBuilder {
        stringBuilder.append("\t".repeat(indent)).append("+ Literal")

        stringBuilder.append(" = ($type, ${value})")

        return stringBuilder
    }

    enum class Type {
        Nil,
        Boolean,
        Float,
        String,
        Int,
        Hex,
        HexFloat
    }
}