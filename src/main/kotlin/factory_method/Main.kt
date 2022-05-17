package factory_method

import java.util.Scanner

lateinit var myLogistic: Logistic
fun main() {
    val logistics = listOf(RoadLogistic(), SeaLogistic(), PlaneLogistic())
    val inp = Scanner(System.`in`)
    do {
        print("Product name: ")
        val productName = inp.next()
        showCommand()
        val n = inp.nextInt()
        if (n <= logistics.size) myLogistic = logistics[n-1]
        else break
        myLogistic.createTransport()

        myLogistic.delivery(productName)
    } while (true)
}

fun showCommand() {
    println("Select Transport")
    println("1. Car")
    println("2. Boat")
    println("3. Plane")
    println("0. Exit")
}


