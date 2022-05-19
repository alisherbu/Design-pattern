package abstract_factory.phones

import abstract_factory.chargers.Charger
import abstract_factory.earphones.Earphone

class Xiaomi : Phone {
    override var currentCharge: Int = 100
    override val phoneName: String
        get() = "Xiaomi"

    override fun listenMusicWithEarphone(earphone: Earphone) {
        earphone.play(25)
    }

    override fun charge(charger: Charger) {
        charger.charge(false)
    }
}