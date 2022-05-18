package abstract_factory.market

import abstract_factory.chargers.Charger
import abstract_factory.companies.MobilePhoneCompany
import abstract_factory.earphones.Earphone
import abstract_factory.phones.Phone

class Person(private val name: String) {

    private lateinit var myEarphone: Earphone
    private lateinit var myCharger: Charger
    private var myPhone: Phone? = null

    fun buyPhone(company: MobilePhoneCompany): Phone {
        myEarphone = company.createEarphone()
        myCharger = company.createCharger()
        myPhone = company.createPhone()
        return company.createPhone()
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
}