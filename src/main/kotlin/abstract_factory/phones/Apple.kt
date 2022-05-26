package abstract_factory.phones

import abstract_factory.chargers.Charger
import abstract_factory.earphones.Earphone

class Apple : Phone {
    override var currentCharge: Int = 100
    override val phoneName: String
        get() = "Apple"

    override fun listenMusicWithEarphone(earphone: Earphone) {
        earphone.play(12)
        print("Singing... ")
        repeat(10) {
            Thread.sleep(500)
            when (it) {
                in 0..9 -> print("${(10 - it) * 10}% ")
            }
        }
        currentCharge = 0
        println("Battery has been empty.")
    }

    override fun charge(charger: Charger) {
        charger.charge(true)
    }
}