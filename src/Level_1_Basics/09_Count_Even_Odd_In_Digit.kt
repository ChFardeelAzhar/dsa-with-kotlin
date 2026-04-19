package Level_1_Basics

fun main() {

    println(countEvenOddInDigit())
}

fun countEvenOddInDigit(num: Int =  11156) : Pair<Int, Int>{

    var number = num
    var evenNumbers = 0
    var oddNumbers = 0

    while (number != 0 ){

        val currentDigit = number % 10

        if (currentDigit %  2 == 0){
            evenNumbers++
        } else {
            oddNumbers++
        }

        number /= 10

    }

    println("Total Even: $evenNumbers")
    println("Total Odd: $oddNumbers")


    return Pair(evenNumbers, oddNumbers)
}