package me.cynsin

import me.cynsin.almostlua.vm.Source
import me.cynsin.almostlua.vm.BytecodeGenerator

fun main() {
    val vm = BytecodeGenerator().compile(
        Source.fromResource(
            "Simple.ass", "turing"
        )
    )
    println(vm)

}