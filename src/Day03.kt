fun main() {

    val charactersSmall = "abcdefghijklmnopqrstuvwxyz"
    val charactersCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val characters = charactersSmall + charactersCaps
    val range = (1..52).toList()

    val priority = range.associateBy { characters[it - 1] }

    fun part1(input: List<String>): Int = input.sumOf { items ->
        val compartments = items.chunked(items.length / 2)
        val test = compartments.first().find { firstItem ->
            compartments.last().any { secondItem ->
                firstItem == secondItem
            }
        }
        test?.let { priority[it]!! } ?: 0
    }

    fun part2(input: List<String>): Int {
        return 0
    }

//    val testInput = readInput("Day03_test")
//    println(part1(testInput))

    val input = readInput("Day03")
    println(part1(input))
}
