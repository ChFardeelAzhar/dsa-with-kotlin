package Level_1_Basics

fun main() {

    val isPalindromeString = findPalindrome("madam")
    if (isPalindromeString){
        print("Palindrome String")
    } else {
        print("Not Palindrome String")
    }
}

fun findPalindrome(str: String): Boolean {

    val orignalString = str
    var currentString = ""

    for (i in str.length -1 downTo 0) {
        currentString += str[i]
    }

    val result = if (orignalString == currentString) true else false

    return result
}