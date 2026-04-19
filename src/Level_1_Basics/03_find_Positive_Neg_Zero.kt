package Level_1_Basics

fun main() {

    println(findPositiveNegativeZero(10))
    println(findPositiveNegativeZero(-8))
    println(findPositiveNegativeZero(0))

}

fun findPositiveNegativeZero(number : Int): String {
    return when {
        number > 0 -> "Positive Number"
        number < 0 -> "Negitive Number"
        else -> "Zero"
    }
}