package Level_1_Basics

fun main() {
    println(reverseNumber(571))
}

fun reverseNumber(num : Int) : Int{
    var tempNumber = num
    var reverseNumber = 0
//    with for loop
//    for (i in 1..num.toString().length){
//        val currentNumber = tempNumber % 10
//        reverseNumber = reverseNumber * 10 + currentNumber
//        tempNumber /= 10
//    }


    // with while loop best approach
    while (tempNumber != 0){

        val currentNumber = tempNumber % 10
        reverseNumber = reverseNumber * 10 + currentNumber
        tempNumber /= 10

    }

    return reverseNumber

}