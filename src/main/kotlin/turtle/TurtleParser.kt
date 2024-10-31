package turtle

class TurtleParser {
    fun parseCommand(input: String): List<TurtleCommand> {
        val commands = mutableListOf<TurtleCommand>()
        val regex = Regex("""([A-Z])(\d*)""")

        for (match in regex.findAll(input)) {
            val command = match.groupValues[1]
            val argument = match.groupValues[2].toIntOrNull()

            val turtleCommand =
                when (command) {
                    "P" -> SelectPen(argument ?: 1)
                    "D" -> PenDown()
                    "U" -> PenUp()
                    "W" -> DrawWest(argument ?: 1)
                    "N" -> DrawNorth(argument ?: 1)
                    "E" -> DrawEast(argument ?: 1)
                    "S" -> DrawSouth(argument ?: 1)
                    else -> throw IllegalArgumentException("Unknown command: $command")
                }
            commands.add(turtleCommand)
        }
        return commands
    }
}
