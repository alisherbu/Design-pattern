package abstract_factory.person

import abstract_factory.chargers.Charger
import abstract_factory.companies
import abstract_factory.companies.MobilePhoneCompany
import abstract_factory.earphones.Earphone
import abstract_factory.phones.Phone
import java.util.*

class Person(private val name: String) {
    private val inp = Scanner(System.`in`)

    private lateinit var myEarphone: Earphone
    private lateinit var myCharger: Charger
    private var myPhone: Phone? = null

    fun buyPhone() {
        val company: MobilePhoneCompany
        selectDevice()
        if (myPhone != null) {
            println("Unfortunately, you have a ${myPhone?.phoneName}")
        } else {
            val c = inp.nextInt() - 1
            if (c < companies.size) {
                company = companies[c]
                myEarphone = company.createEarphone()
                myCharger = company.createCharger()
                myPhone = company.createPhone()
            } else {
                println("We have not this phone.")
                buyPhone()
            }
        }
    }

    fun listenMusic() {
        if (myPhone != null) {
            myPhone?.listenMusicWithEarphone(myEarphone)
        } else {
            println("Oops, to hear the music, you need to buy a phone first.")
        }
    }

    fun charge() {
        if (myPhone != null) {
            myPhone?.charge(myCharger)
        } else {
            println("$name, you have not a phone to charge.")
        }
    }

    fun sellPhone() {
        if (myPhone != null) {
            myPhone = null
            println("$name, your phone sold successfully.")
        } else {
            println("$name, you have not a phone to sell.")
        }
    }

    private fun selectDevice() {
        println("1. Apple")
        println("2. Samsung")
        println("3. Xiaomi")
    }
}