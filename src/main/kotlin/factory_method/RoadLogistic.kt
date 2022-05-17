package factory_method

class RoadLogistic : Logistic() {
    override fun createTransport(): Transport {
        return Car()
    }
}