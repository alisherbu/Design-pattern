package abstract_factory.companies

import abstract_factory.chargers.AppleCharger
import abstract_factory.chargers.Charger
import abstract_factory.earphones.AppleEarphone
import abstract_factory.earphones.Earphone
import abstract_factory.phones.Apple
import abstract_factory.phones.Phone

class AppleCompany : MobilePhoneCompany {

    override val companyName get() = "Apple Company"

    override fun createPhone(): Phone {
        println("Congratulations on your new Apple phone.")
        return Apple()
    }

    override fun createEarphone(): Earphone {
        return AppleEarphone()
    }

    override fun createCharger(): Charger {
        return AppleCharger()
    }

}