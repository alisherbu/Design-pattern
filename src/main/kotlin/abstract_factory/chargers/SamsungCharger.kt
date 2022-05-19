package abstract_factory.chargers

class SamsungCharger : Charger {
    override fun charge(isFaster: Boolean) {
        print("Samsung Charging... ")
        repeat(10) {
            Thread.sleep(500)
            when (it) {
                in 0..9 -> print("${(it + 1) * 10}% ")
            }
        }
        println("Fulled")
    }
}