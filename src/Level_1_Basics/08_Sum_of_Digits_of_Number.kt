package Level_1_Basics

fun main() {

    // Find Sum of digits 4598
    // 4 + 5 + 9 + 8  = 26

    println(findSumOfDigits(4598))
}

fun findSumOfDigits(num: Int) : Int{

    var number = num
    var sum = 0

    while (number != 0) {
       val currentNumber = number % 10
        sum += currentNumber
        number /= 10

    }

    return sum


}