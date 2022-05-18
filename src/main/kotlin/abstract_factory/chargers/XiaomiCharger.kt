package abstract_factory.chargers

class XiaomiCharger : Charger {
    override fun charge(isFaster: Boolean) {
        println("Xiaomi charging...")
    }
}