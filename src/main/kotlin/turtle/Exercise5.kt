package turtle

fun main() {
    turtleGraphics {
        selectPen(2)
        penDown()
        drawWest(20)
        drawNorth(10)
        drawEast(20)
        drawSouth(10)
        penUp()
    }
}
