package Level_1_Basics

fun main() {
    // Count even odd number in the array

    val array = arrayOf(2,23,3,5,22,10,8)
    println(countEvenOddInArray(array))


}

fun countEvenOddInArray(array: Array<Int>): Pair<List<Int>, List<Int>> {

    var evenNumbers = mutableListOf<Int>()
    var oddNumbers =  mutableListOf<Int>()

    for (i in array){

        if (i % 2 == 0){
            evenNumbers.add(i)
        }else {
            oddNumbers.add(i)
        }

    }

    return Pair(evenNumbers, oddNumbers)


}