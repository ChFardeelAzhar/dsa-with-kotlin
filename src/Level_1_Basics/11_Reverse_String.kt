package Level_1_Basics

fun main() {

    println(reverseString("ldrF"))

}


fun reverseString(str: String): String {

    var result = ""

    for (i in str.length -1 downTo 0) {
        result += str[i]
    }

    return result


}