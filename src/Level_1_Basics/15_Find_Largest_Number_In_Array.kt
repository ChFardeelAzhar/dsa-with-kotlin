package Level_1_Basics

fun main() {

    val array = arrayOf<Int>(2,3,4,6,32,4)
    val largestNumber = findLargestNumber(array)

    println("Largest Number in the array is: $largestNumber")

}


fun findLargestNumber(array: Array<Int>): Int {

    var largeNumber = array[0]

    for (num in array){

        if (num > largeNumber){
            largeNumber = num
        }

    }

    return largeNumber


}