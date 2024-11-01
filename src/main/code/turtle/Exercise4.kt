package turtle

fun main() {
    val turtleGraphics = TurtleGraphics()
    val parser = TurtleParser()

    val input =
        """
        P2 D W2 N1 E2 S1 U
        """.trimIndent()

    val commands = parser.parseCommand(input)

    for (command in commands) {
        command.execute(turtleGraphics)
    }
}
