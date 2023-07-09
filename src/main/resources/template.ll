
 pub <header title=nil bg=0xff22aa>
    if title then gui.text(gui.get_width()/2, 0, title, 0x33ff22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0) end
    if bg then gui.draw_box(0, 0, gui.get_width(), gui.get_height(), bg, rounded ~= nil ? rounded : 0) end
 </header>

 pub <body style = {
    color: 0x33ff22,
    image: "images/style.png"
}>
    if style.color ~= 0x33ff22 or style.image ~= "images/style.png" then
        console.log("Got custom style: ${style}")
    end
</body>
