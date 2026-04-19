package Level_1_Basics

fun main() {

    println(countVowels("hello"))
}

fun countVowels(str: String) : Int {

    var count = 0
    var vowels = ""

    for (i in str){

        if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
            vowels += i
            count++
        }

    }


    println(vowels)

    return count


}