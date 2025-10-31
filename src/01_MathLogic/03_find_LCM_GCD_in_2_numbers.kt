package `01_MathLogic`

import kotlin.math.min

fun main() {

    findGCDAndLCM(20,28)
}

fun findGCDAndLCM(num1: Int, num2: Int) {

    var gcd = 0
    var lcm = 0
    val minNumber = if (num1 < num2) num1 else num2
    println(minNumber)
    for(i in 2..minNumber){

        if (num1 % i == 0 && num2 % i == 0) {
            gcd = i
        }

    }

    println("GCD between $num1 and $num2 is : $gcd")

    // Find LCM

    if (gcd > 0){
        lcm = (num1 * num2) / gcd
    }
    println("LCM between $num1 and $num2 is : $lcm")

}
