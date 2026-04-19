package Level_1_Basics

fun main() {


    // check a given number is even or odd

    val isEven = checkEvenOdd(8)

    if (isEven){
        println("Even Number")
    }else {
        println("Odd Number")
    }
}

fun checkEvenOdd(number : Int) : Boolean {

    // for beginner syntex

//        if (number % 2 == 0) {
//            return true
//        } else {
//            return false
//        }

    // shorter version

    return number % 2 == 0

}