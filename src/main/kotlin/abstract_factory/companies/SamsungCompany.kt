package abstract_factory.companies

import abstract_factory.chargers.Charger
import abstract_factory.chargers.SamsungCharger
import abstract_factory.earphones.Earphone
import abstract_factory.earphones.SamsungEarphone
import abstract_factory.phones.Phone
import abstract_factory.phones.Samsung

class SamsungCompany : MobilePhoneCompany {

    override val companyName get() = "Samsung Company"

    override fun createPhone(): Phone {
        println("Congratulations on your new Samsung phone.")
        return Samsung()
    }

    override fun createEarphone(): Earphone {
        return SamsungEarphone()
    }

    override fun createCharger(): Charger {
        return SamsungCharger()
    }

}