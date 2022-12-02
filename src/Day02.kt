fun main() {

    /**
     *
     * Part 1:
     * A or X -> Rock -> 1
     * B or Y -> Paper -> 2
     * C or Z -> Scissor -> 3
     *
     * Part 2:
     * X -> Lose -> 0
     * Y -> Draw -> 3
     * Z -> Win -> 6
     */

    val pointsTable = mapOf(
        'A' to 1, 'B' to 2, 'C' to 3
    )

    val part1YourPointTable = mapOf(
        'X' to 1, 'Y' to 2, 'Z' to 3
    )

    fun rockPaperScissorPart1(opponent: Char, yourMove: Char): Int = when (opponent) {
        'A' -> part1YourPointTable[yourMove]!!.plus(
            when (yourMove) {
                'X' -> 3
                'Y' -> 6
                'Z' -> 0
                else -> -1
            }
        )

        'B' -> part1YourPointTable[yourMove]!!.plus(
            when (yourMove) {
                'X' -> 0
                'Y' -> 3
                'Z' -> 6
                else -> -1
            }
        )

        'C' -> part1YourPointTable[yourMove]!!.plus(
            when (yourMove) {
                'X' -> 6
                'Y' -> 0
                'Z' -> 3
                else -> -1
            }
        )

        else -> -1
    }

    fun rockPaperScissorPart2(opponent: Char, situation: Char): Int = when (opponent) {
        'A' -> when (situation) {
            'X' -> pointsTable['C']!!.plus(0)
            'Y' -> pointsTable['A']!!.plus(3)
            'Z' -> pointsTable['B']!!.plus(6)
            else -> -1
        }

        'B' -> when (situation) {
            'X' -> pointsTable['A']!!.plus(0)
            'Y' -> pointsTable['B']!!.plus(3)
            'Z' -> pointsTable['C']!!.plus(6)
            else -> -1
        }

        'C' -> when (situation) {
            'X' -> pointsTable['B']!!.plus(0)
            'Y' -> pointsTable['C']!!.plus(3)
            'Z' -> pointsTable['A']!!.plus(6)
            else -> -1
        }

        else -> -1
    }

    fun part1(input: List<String>): Int = input.sumOf {
        rockPaperScissorPart1(it.first(), it.last())
    }

    fun part2(input: List<String>): Int = input.sumOf {
        rockPaperScissorPart2(it.first(), it.last())
    }

//    val testInput = readInput("Day02_test")
//    println(part2(testInput))

//    val input = readInput("Day02")
//    println(part2(input))
}
