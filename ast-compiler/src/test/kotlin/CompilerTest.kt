import me.cynsin.almostlua.Tree
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

        val program = Tree.compile(source)
        println(program)
    }
}