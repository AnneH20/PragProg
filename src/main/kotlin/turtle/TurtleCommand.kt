package turtle

interface TurtleCommand {
    fun execute(turtle: TurtleGraphics)
}

class SelectPen(
    private val pen: Int,
) : TurtleCommand {
    override fun execute(turtle: TurtleGraphics) {
        turtle.selectPen(pen)
    }
}

class PenDown : TurtleCommand {
    override fun execute(turtle: TurtleGraphics) {
        turtle.penDown()
    }
}

class PenUp : TurtleCommand {
    override fun execute(turtle: TurtleGraphics) {
        turtle.penUp()
    }
}

class DrawWest(
    private val distance: Int,
) : TurtleCommand {
    override fun execute(turtle: TurtleGraphics) {
        turtle.drawWest(distance)
    }
}

class DrawNorth(
    private val distance: Int,
) : TurtleCommand {
    override fun execute(turtle: TurtleGraphics) {
        turtle.drawNorth(distance)
    }
}

class DrawEast(
    private val distance: Int,
) : TurtleCommand {
    override fun execute(turtle: TurtleGraphics) {
        turtle.drawEast(distance)
    }
}

class DrawSouth(
    private val distance: Int,
) : TurtleCommand {
    override fun execute(turtle: TurtleGraphics) {
        turtle.drawSouth(distance)
    }
}
