package abstract_factory.phones

import abstract_factory.chargers.Charger
import abstract_factory.earphones.Earphone

class Apple : Phone {
    override fun listenMusicWithEarphone(earphone: Earphone) {
        earphone.play(12)
    }

    override fun charge(charger: Charger) {
        charger.charge(true)
    }
}