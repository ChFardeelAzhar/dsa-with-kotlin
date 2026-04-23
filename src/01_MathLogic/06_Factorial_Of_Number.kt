package `01_MathLogic`

fun main() {

    // Find Factorial of a Number example 5
    // 5 * 4 * 3 * 2 * 1 = 120
    println(factorial(5))
}

fun factorial(num: Int): Int {

    var result = 1
    for (i in 1..num){

        result *= i //
    }

    return result

}