package abstract_factory

import abstract_factory.companies.AppleCompany
import abstract_factory.companies.SamsungCompany
import abstract_factory.companies.XiaomiCompany
import abstract_factory.person.Person
import java.util.Scanner

val companies = listOf(AppleCompany(), SamsungCompany(), XiaomiCompany())
val inp = Scanner(System.`in`)
fun main() {
    val person = Person("Alisher")
    while (true) {
        showCommand()
        when (inp.nextInt()) {
            1 -> person.buyPhone()
            2 -> person.listenMusic()
            3 -> person.charge()
            4 -> person.sellPhone()
            0 -> break
            else -> println("Sorry, I can't do it")
        }
    }
}

fun showCommand() {
    println("1. Buy new phone")
    println("2. Listen music")
    println("3. Charge")
    println("4. Sell phone")
    println("0. Exit")
}
