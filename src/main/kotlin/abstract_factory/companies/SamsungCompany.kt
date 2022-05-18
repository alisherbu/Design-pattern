package abstract_factory.companies

import abstract_factory.chargers.Charger
import abstract_factory.chargers.SamsungCharger
import abstract_factory.earphones.Earphone
import abstract_factory.earphones.SamsungEarphone
import abstract_factory.phones.Phone
import abstract_factory.phones.Samsung

class SamsungCompany : MobilePhoneCompany {

    override fun createPhone(): Phone {
        return Samsung()
    }

    override fun createEarphone(): Earphone {
        return SamsungEarphone()
    }

    override fun createCharger(): Charger {
        return SamsungCharger()
    }

}