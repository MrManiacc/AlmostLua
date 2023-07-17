package me.cynsin.almostlua.vm

import me.cynsin.almostlua.ast.expression.BinaryOp

data class Bytecode(val instructions: Array<Instruction>) {
    override fun toString(): String {
        val sb = StringBuilder()
        instructions.forEach {
            sb.append(it.toString()).append("\n")
        }
        return sb.toString()
    }

    sealed class Instruction(val id: Byte) {
        abstract fun computeLength(): Int

        // INIT_TABLE instruction used to start a new table in memory
        data class InitTable(val payload: Any? = null) : Instruction(0x00) {
            override fun computeLength() = 1 // id size
        }

        // PushConstByte pushes a Byte constant onto the stack
        data class PushConstByte(val value: Byte) : Instruction(0x02) {
            override fun computeLength() = 1 + 1 // id size + byte size
        }

        // PushConstShort pushes a Short constant onto the stack
        data class PushConstShort(val value: Short) : Instruction(0x03) {
            override fun computeLength() = 1 + 2 // id size + short size
        }

        // PushConstInt pushes an Int constant onto the stack
        data class PushConstInt(val value: Int) : Instruction(0x04) {
            override fun computeLength() = 1 + 4 // id size + integer size
        }

        // PushConstFloat pushes a Float constant onto the stack
        data class PushConstFloat(val value: Float) : Instruction(0x05) {
            override fun computeLength() = 1 + 4 // id size + integer size
        }

        // PushConstDouble pushes a Double constant onto the stack
        data class PushConstDouble(val value: Double) : Instruction(0x06) {
            override fun computeLength() = 1 + 8 // id size + long size
        }

        // PushConstString pushes a String constant onto the stack
        data class PushConstString(val value: String) : Instruction(0x07) {
            override fun computeLength() = 1 + value.toByteArray().size // id size + string size
        }

        // STORE instruction stores the top of the stack into the new top of the stack (the second value)
        object Store : Instruction(0x08) {
            override fun computeLength() = 1  // id size + string size
        }

        // SUBTRACT instruction subtracts the top two values on the stack and pushes the result
        object Subtract : Instruction(0x09) {
            override fun computeLength() = 1 // id size
        }

        // INIT_FUNC instruction declares a new function
        data class InitFunc(val functionName: String) : Instruction(0x0A) {
            override fun computeLength() = 1 + functionName.toByteArray().size // id size + string size
        }

        // BEGIN_PARAMS instruction denotes the start of a function's parameters
        object BeginParams : Instruction(0x0B) {
            override fun computeLength() = 1 // id size
        }

        // PARAM instruction declares a new function parameter
        data class Param(val paramName: String) : Instruction(0x0C) {
            override fun computeLength() = 1 + paramName.toByteArray().size // id size + string size
        }

        // Binary operation instruction (ADD, SUB, MUL, etc.)
        data class Binary(val operator: BinaryOp.Operator) : Instruction(0x0D) {
            override fun computeLength() = 1 + 1 // id size. operator size
        }

        // RETURN instruction pops the top value from the stack and returns it as the result of a function
        object Return : Instruction(0x0E) {
            override fun computeLength() = 1 // id size
        }

        // LOAD instruction loads a variable onto the stack
        data class Load(val varName: String) : Instruction(0x0F) {
            override fun computeLength() = 1 + varName.toByteArray().size // id size + string size
        }

        // CALL instruction calls a function with a certain number of arguments
        data class Call(val functionName: String, val argCount: Byte) : Instruction(0x10) {
            override fun computeLength() =
                1 + functionName.toByteArray().size + 1 // id size + string size + argument count size
        }

        // END_PARAMS instruction denotes the end of a function's parameters
        object EndParams : Instruction(0x11) {
            override fun computeLength() = 1 // id size
        }

        // ASSIGN_VAR instruction assigns a value to a variable
        data class AssignVar(val varName: String) : Instruction(0x12) {
            override fun computeLength() = 1 + varName.toByteArray().size // id size + string size
        }

        // ASSIGN_FIELD instruction assigns a value to a field of a table
        data class AssignField(val fieldName: String) : Instruction(0x13) {
            override fun computeLength() = 1 + fieldName.toByteArray().size // id size + string size
        }

        override fun toString(): String {
            return "${this::class.simpleName}($id)[${computeLength()}]"
        }
    }

    class Builder() {
        private val instructions = mutableListOf<Instruction>()

        fun initTableInst(payload: Any? = null) = apply {
            instructions.add(Instruction.InitTable(payload))
        }


        fun pushConstByteInst(value: Byte) = apply {
            instructions.add(Instruction.PushConstByte(value))
        }

        fun pushConstShortInst(value: Short) = apply {
            instructions.add(Instruction.PushConstShort(value))
        }

        fun pushConstIntInst(value: Int) = apply {
            instructions.add(Instruction.PushConstInt(value))
        }

        fun pushConstFloatInst(value: Float) = apply {
            instructions.add(Instruction.PushConstFloat(value))
        }

        fun pushConstDoubleInst(value: Double) = apply {
            instructions.add(Instruction.PushConstDouble(value))
        }

        fun pushConstStringInst(value: String) = apply {
            instructions.add(Instruction.PushConstString(value))
        }


        fun storeInst() = apply {
            instructions.add(Instruction.Store)
        }

        fun subtractInst() = apply {
            instructions.add(Instruction.Subtract)
        }

        fun initFuncInst(functionName: String) = apply {
            instructions.add(Instruction.InitFunc(functionName))
        }

        fun beginParamsInst() = apply {
            instructions.add(Instruction.BeginParams)
        }

        fun paramInst(paramName: String) = apply {
            instructions.add(Instruction.Param(paramName))
        }

        fun binaryInst(op: BinaryOp.Operator) = apply {
            instructions.add(Instruction.Binary(op))
        }

        fun returnInst() = apply {
            instructions.add(Instruction.Return)
        }

        fun loadInst(varName: String) = apply {
            instructions.add(Instruction.Load(varName))
        }

        fun callInst(functionName: String, argCount: Byte) = apply {
            instructions.add(Instruction.Call(functionName, argCount))
        }

        fun endParamsInst() = apply {
            instructions.add(Instruction.EndParams)
        }

        fun assignVarInst(varName: String) = apply {
            instructions.add(Instruction.AssignVar(varName))
        }

        fun assignFieldInst(fieldName: String) = apply {
            instructions.add(Instruction.AssignField(fieldName))
        }

        fun build() = Bytecode(instructions.toTypedArray())


    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Bytecode

        return instructions.contentEquals(other.instructions)
    }

    override fun hashCode(): Int {
        return instructions.contentHashCode()
    }
}