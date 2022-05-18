package abstract_factory.companies

import abstract_factory.chargers.Charger
import abstract_factory.earphones.Earphone
import abstract_factory.phones.Phone

interface MobilePhoneCompany {
    val companyName: String
    fun createPhone(): Phone
    fun createEarphone(): Earphone
    fun createCharger(): Charger
}