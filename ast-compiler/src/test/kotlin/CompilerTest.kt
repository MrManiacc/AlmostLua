import me.cynsin.almostlua.Tree
import me.cynsin.almostlua.vm.Source
import me.cynsin.almostlua.vm.BytecodeGenerator
import org.junit.jupiter.api.Test

class CompilerTest {
    @Test
    fun `Test the compiliation of source`() {
        val source = """
            -- Creates Button template that accepts onClick and onHover
            -- @param onHover - called when the mouse is hovered
            -- @param onClick - called when the button is hovered and the mouse is down
            return <Button onClick, onHover>
                if isHovered() then 
                    onHover()
                    if isMousePressed() then
                        onClick()
                    end
                end
                
            <Button/>, <Button onClick=function() 
                println("Clicked")
            end/>
        """.trimIndent()
        val sb = StringBuilder()
        val program = Tree.compile(source)
        program.dump(0, sb)
        println(sb.toString())
    }

    @Test
    fun `Test the compiliation of source no xml`() {
        val source = """
            a,b,c = 5, 10, 8
            
            return a * b - c
        """.trimIndent()
        val sb = StringBuilder()
        val program = Tree.compile(source)
        program.dump(0, sb)

        println(sb.toString())
    }

    @Test
    fun fibtest() {
        val vm = BytecodeGenerator.compile(
            Source.fromString(
                """
            fib = function(n) 
                if n == 0 then
                    return 0
                else
                    if n == 1 then
                        return 1
                    else
                        return fib(n-1) + fib(n-2)
                    end
                end
            end
            
            return fib(10)
        """.trimIndent(), "turing"
            ),
        )
    }

    @Test
    fun `Test bytecode generation`() {
        val source = """
            -- Creates Button template that accepts onClick and onHover
            -- @param onHover - called when the mouse is hovered
            -- @param onClick - called when the button is hovered and the mouse is down
            return <Button onClick, onHover>
                if isHovered() then 
                    onHover()
                    if isMousePressed() then
                        onClick()
                    end
                end
                
            <Button/>, <Button onClick=function() 
                println("Clicked")
            end/>
        """.trimIndent()
        val program = Tree.compile(source)
//        val bytecode = program.generateBytecode()
//        println(bytecode)


    }
}