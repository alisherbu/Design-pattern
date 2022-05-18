package factory_method

class SeaLogistic : Logistic() {
    override fun createTransport(): Transport {
        return Boat()
    }
}