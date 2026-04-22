package `01_MathLogic`

fun main() {

    // Find fibonacci series of given Number -> 7

    // Fibonacci -> Aik series 0 se number tak jisme har next word pichle 2 ka sum hoga.
    // Example : a = 0, b = 1,
    // next word = 1
    // Expected Results : (0,1,1,2,3,5,8)

    println(fibonacci())



}

fun fibonacci(number: Int = 6): List<Int> {

    val fibonacci = mutableListOf<Int>()

    // Edge cases
    if (number == 0) return fibonacci()
    if (number == 1) return fibonacci(0)

    // understood ha phly 2 fibonacci me 0 or 1 hi hain phly inko add karain gay list me or loop
    var firstNumber = 0  // Previous Number
    var secondNumber = 1 // current Number


    fibonacci.add(firstNumber)
    fibonacci.add(secondNumber)


    // previous + current = next Int

    for (i in 2..number){
        val next = firstNumber + secondNumber
        fibonacci.add(next)

        // First Number ko agy barhao -> Ab first number me 2sra integer a gya ha (ab wo second ban jaye)
        firstNumber = secondNumber

        // secondNumber ko new value do → jo abhi calculate ki (next)
        secondNumber = next


    }

    return fibonacci

}