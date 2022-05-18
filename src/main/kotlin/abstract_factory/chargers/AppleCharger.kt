package abstract_factory.chargers


class AppleCharger : Charger {
    override fun charge(isFaster: Boolean) {
        println("Charging...")
    }
}