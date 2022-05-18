package abstract_factory.chargers

class SamsungCharger : Charger {
    override fun charge(isFaster: Boolean) {
        println("Samsung charging...")
    }
}