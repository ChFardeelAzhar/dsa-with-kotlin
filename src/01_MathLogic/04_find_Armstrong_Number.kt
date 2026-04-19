package `01_MathLogic`

/*
🔢 Problem:
    Check if a given number is an Armstrong number.
    🧠 Input:A number (e.g., 153)
 */

fun main() {



    // 1 5 3
    // if we take power of total digits for each number and the sum of the cubes of these numbers
    // is equal to the actual number then the number is armstrong number.

    // 1 * 1 * 1 = 1
    // 5 * 5 * 5 = 125
    // 3 * 3 * 3 = 27

    // and the total sum of the cubes is equal to actual number which was 153 them our number
    // is armstrong

    // so let's see
//
//    val sum = 1 + 125 + 27
//    val actualNumber = 153
//
//    println(sum)
//
//    val armstrong = if (sum == actualNumber) {
//        println("The Number is Armstrong Number")
//    }else {
//        println("The Number is Armstrong Number")
//    }

    val result = findArmstrongNumber(123)

}


fun findArmstrongNumber(num : Int = 153) : Boolean {

    val actualNumber = num // 153
    var tempNumber = num   // 153
    val length = actualNumber.toString().length
    var sum = 0


    while (tempNumber != 0) {

        // so we have to get the last number first
        // we know to get the last digit from a number we take % with 10
        val currentDigit = tempNumber % 10

        var powerResult = 1
        for (i in 1..length) {
           powerResult = powerResult * currentDigit
        }
        sum += powerResult
        tempNumber /= 10
    }

    if (sum == actualNumber)
        print("The Number $actualNumber is Armstrong")
     else
        print("The Number $actualNumber is not Armstrong")

    return sum == actualNumber

}