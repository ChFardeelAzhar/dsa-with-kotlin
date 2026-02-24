package `01_MathLogic`

import kotlin.math.max
import kotlin.math.min


/**
 * LCM (Least Common Multiple) Logic Building
 * Formula: Smallest number divisible by both 'a' and 'b'
 */

fun main() {
    // Find LCM between two numbers (LCM : Least common Multiple)

//    findLCM(4,5)
//    findLCM(5,15)
//    findLCM(7,11)
    findLCM(2,100)

}

fun findLCM(a: Int, b: Int): Int {
    /*
     STEP : 1
     -> sab se phly ham dekhain gay ke loop kahan se start hoga or kahan tak chale ga.
     -> hamne wo phla number dhondna ha sab se bara number jo in dono ke table me ata ha
     -> hamara LCM kabi b jo numbers hain do unse chota ni hota
     -> hamesha ya to MAX number hota ha ya usse bara number
     -> Dono Numbers ka product aik common Multiple hota ha
     -> Is lye ham loop ko max number se dono ke multiple (Product tak chalayen gay)
     */

    val maxNumber = if ( a > b ) a else b // Start point of loop
    val product = a * b                   // End point of loop
    var lcm = maxNumber                   // Default lcm


    // STEP 2
    // Hum 'maxNumber' se 'product' tak har number check karain gay
    // Agar to 'i'(max number or usse agly numbers koi b) dono numbers se dividable hua to wahi lcm ha
    for (i in maxNumber..product) {

        // STEP 3
        // agar to 'i' dono numbers se devide hota ha to 'i' LCM ha
        // 'i' ke andar default value 'maxNumber' hogi or phir usse onward check karain gay
        // Jahan condition true hue 'i' ki wahi value hamara LCM hogi
        if (i % a == 0 && i % b == 0) {
            lcm = i
            break    // Agar LCM mil jata ha to loop ko break karwa dain gay
        }
    }
    println("LCM between $a and $b is : ${lcm}")
    return lcm

}
