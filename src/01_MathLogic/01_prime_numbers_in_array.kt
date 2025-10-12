package `01_MathLogic`

fun main (){

    // Find All the prime Numbers in the array.
    val numbers = arrayOf(5,6,7,8,10,23,43,56,87)

    // If number will be prime we will add it here in the list.
    val primeList = mutableListOf<Int>()


    // Check if a single number is prime or not.
    // isPrimeNumber(11)



    // Loop for each number to check its prime or not.
    for (i in numbers){
        val isPrime = isPrimeNumber(i)
        if (isPrime) primeList.add(i)
    }

    println(primeList) // result are [5,7]

}

fun isPrimeNumber(number: Int): Boolean {

    var i = 2

    // if the number is 1 or 0 then it's not prime
    if (number <= 1) {
        return false
    }

    // for checking the number is prime or not we are going to write a logic below.
    while (i*i <= number){
        // now here we will write a logic to check actually one by one
        // the current number is dividable with others or not.

        if (number % i == 0){
            return false
            break
        }
        i++
    }

    return true

}