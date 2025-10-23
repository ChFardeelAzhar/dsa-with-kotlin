package `01_MathLogic`

fun main() {

    // Find a number is palindrome or Not
    // method1()
    // method2(121)

    findPalindrome(5678)
}


fun findPalindrome(n: Int = 1234) {

    var number = n
    var reversedNumber = 0

    while (number != 0) {
        val lastDigit = number % 10
        reversedNumber = reversedNumber * 10 + lastDigit
        number /= 10
    }

    if (reversedNumber == n) {
        println("$n is palindrome")
    } else{
        println("$n is not palindrome")
    }

    println("Reverse Number : $reversedNumber ")


}

fun method1(){
    // first we will reverse a number and print it
    val palindromeNumber = 1221

    var number = palindromeNumber
    var reversedNumber = mutableListOf<Int>()

    for (i in number.toString()) {

         var currentLastNumber = number % 10
        reversedNumber.add(currentLastNumber)
        number /= 10

    }

    // Step 2 — convert list of digits into a single number
    var outputNumber = 0
    for (digit in reversedNumber) {

        outputNumber = outputNumber * 10 + digit
    }

    println("Reversed Digits: $reversedNumber")
    println("Reversed Number: $outputNumber")

    // now we will check here if output number is equal to our first default number then its palindrome
    if (outputNumber == palindromeNumber){
        println("$outputNumber is palindrome")
    }else{
        println("$outputNumber is not palindrome")
    }
}


