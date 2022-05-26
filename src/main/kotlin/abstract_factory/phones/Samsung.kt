package abstract_factory.phones

import abstract_factory.chargers.Charger
import abstract_factory.earphones.Earphone

class Samsung : Phone {
    override var currentCharge: Int = 100
    override val phoneName: String
        get() = "Samsung"

    override fun listenMusicWithEarphone(earphone: Earphone) {
        earphone.play(40)
    }

    override fun charge(charger: Charger) {
        charger.charge(true)
    }
}