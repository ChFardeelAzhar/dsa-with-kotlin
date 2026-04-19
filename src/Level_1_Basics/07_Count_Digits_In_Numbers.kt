package Level_1_Basics

fun main() {
    print(countDigitsInNumber(0))
}

fun countDigitsInNumber(number: Int) : Int{


    if (number == 0 ) return 1
    // without built in
    var tempNumber = number
    var count = 0

    while (tempNumber != 0 ){
        tempNumber /= 10
        count++
    }

//    with built in function
//    for (i in 1..number.toString().length) {
//        count++
//    }

    return count

}