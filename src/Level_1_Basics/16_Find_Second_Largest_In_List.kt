package Level_1_Basics

fun main() {

    val array = arrayOf(10,22,33,22,51,14)
    println(findSecondLargest(array))
}

fun findSecondLargest(array: Array<Int>): Int {

    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (num in array){

        if (num > largest){
            secondLargest = largest   // purana largest ab second ban gaya
            largest = num            // naya largest
        } else if (num > secondLargest && num != largest){
            secondLargest = num
        }
    }

    return secondLargest
}