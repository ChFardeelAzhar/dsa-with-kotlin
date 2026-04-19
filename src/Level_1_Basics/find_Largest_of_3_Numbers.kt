package Level_1_Basics

fun main() {

    print(findLargestNumber(9,12,8))
}

fun findLargestNumber(num1: Int, num2: Int, num3 : Int): Int {

    // with built in function

    val LargeNumber = maxOf(num1,num2,num3)


    // without built in
    val largestNumber = if (num1 >= num2 && num1 >= num3){
        num1
    } else if (num2 >= num1 && num2 >= num3){
        num2
    } else {
        num3
    }

    return largestNumber
}