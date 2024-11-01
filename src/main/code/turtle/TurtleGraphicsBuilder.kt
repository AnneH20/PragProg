package turtle

fun turtleGraphics(block: TurtleGraphics.() -> Unit): TurtleGraphics {
    val turtleGraphics = TurtleGraphics()
    turtleGraphics.block()
    return turtleGraphics
}
