package abstract_factory

import abstract_factory.companies.AppleCompany
import abstract_factory.companies.SamsungCompany
import abstract_factory.companies.XiaomiCompany
import abstract_factory.market.Person

fun main() {
    val companies = listOf(AppleCompany(), SamsungCompany(), XiaomiCompany())
    val person = Person("Alisher")
    person.buyPhone(companies[0])
    person.listenMusic()
    person.charge()
    person.sellPhone()
}