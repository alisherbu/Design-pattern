package abstract_factory.phones

import abstract_factory.chargers.Charger
import abstract_factory.earphones.Earphone

interface Phone {
    fun listenMusicWithEarphone(earphone: Earphone)
    fun charge(charger: Charger)
}