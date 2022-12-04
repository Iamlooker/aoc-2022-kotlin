fun main() {

    fun convertToRange(start: String, end: String): IntRange = start.toInt()..end.toInt()

    fun part1(input: List<String>): Long = input.sumOf { work ->
        val workPerElf = work.split(',')
        val firstWork = workPerElf.first().split('-')
        val secondWork = workPerElf.last().split('-')
        val firstRange = convertToRange(firstWork.first(), firstWork.last())
        val secondRange = convertToRange(secondWork.first(), secondWork.last())
        if (secondRange.count() >= firstRange.count()) {
            if (firstRange.last in secondRange && firstRange.first in secondRange) 1L else 0L
        } else {
            if (secondRange.last in firstRange && secondRange.first in firstRange) 1L else 0L
        }
    }

    fun part2(input: List<String>): Long = input.sumOf { work ->
        val workPerElf = work.split(',')
        val firstWork = workPerElf.first().split('-')
        val secondWork = workPerElf.last().split('-')
        val firstRange = convertToRange(firstWork.first(), firstWork.last())
        val secondRange = convertToRange(secondWork.first(), secondWork.last())
        if (secondRange.count() >= firstRange.count()) {
            if (firstRange.last in secondRange || firstRange.first in secondRange) 1L else 0L
        } else {
            if (secondRange.last in firstRange || secondRange.first in firstRange) 1L else 0L
        }
    }

//    val testInput = readInput("Day04_test")
//    println(part2(testInput))

//    val input = readInput("Day04")
//    println(part2(input))
}
