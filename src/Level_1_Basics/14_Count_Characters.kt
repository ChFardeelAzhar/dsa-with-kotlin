package Level_1_Basics

fun main() {

    countCharacters("Fardeel")
}

fun countCharacters(str : String) : Int {

    var count = 0

    for (i in str){
        count++
    }

    println("Total count in String is: $count")

    return count
}