package turtle

class TurtleGraphics {
    fun selectPen(pen: Int) {
        println("Select pen $pen")
    }

    fun penDown() {
        println("Pen down")
    }

    fun penUp() {
        println("Pen up")
    }

    fun drawWest(distance: Int) {
        println("Drawing west $distance cm")
    }

    fun drawNorth(distance: Int) {
        println("Drawing north $distance cm")
    }

    fun drawEast(distance: Int) {
        println("Drawing east $distance cm")
    }

    fun drawSouth(distance: Int) {
        println("Drawing south $distance cm")
    }
}
