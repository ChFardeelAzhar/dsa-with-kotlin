package Level_1_Basics

fun main() {
    printTable(5)
}

fun printTable(num : Int){

    for (i in 1..10){
        println("$num * $i = ${i * num}")
    }

}