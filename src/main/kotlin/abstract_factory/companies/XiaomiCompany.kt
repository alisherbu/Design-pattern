package abstract_factory.companies

import abstract_factory.chargers.Charger
import abstract_factory.chargers.XiaomiCharger
import abstract_factory.earphones.Earphone
import abstract_factory.earphones.XiaomiEarphone
import abstract_factory.phones.Phone
import abstract_factory.phones.Xiaomi

class XiaomiCompany : MobilePhoneCompany {

    override val companyName get() = "Xiaomi Company"

    override fun createPhone(): Phone {
        println("Congratulations on your new Xiaomi phone.")
        return Xiaomi()
    }

    override fun createEarphone(): Earphone {
        return XiaomiEarphone()
    }

    override fun createCharger(): Charger {
        return XiaomiCharger()
    }

}