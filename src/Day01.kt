fun main() {
    fun part1(input: String): Int {
        val data = input.split("\r\n\r\n").map { elfData ->
            elfData.lines().sumOf { it.toInt() }
        }
        return data.sorted().takeLast(3).sum()
    }

//    val testInput = readFile("Day01_test")
//    check(part1(testInput) == 45000)

    val input = readFile("Day01")
    println(part1(input))
}
