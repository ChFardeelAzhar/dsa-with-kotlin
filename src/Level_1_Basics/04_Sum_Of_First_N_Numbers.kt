package Level_1_Basics

fun main() {

    // Find sum of first N Numbers
    println(findSumOfFirstNNumbers(5))
    println(findSumOfFirstNNumbers(6))
    println(findSumOfFirstNNumbers(7))
}

fun findSumOfFirstNNumbers(n: Int): Int {

    var sum = 0
    for (i in 1..n){
        sum += i
    }
    return sum

}