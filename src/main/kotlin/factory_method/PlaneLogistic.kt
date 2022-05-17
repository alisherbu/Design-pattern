package factory_method

class PlaneLogistic : Logistic() {
    override fun createTransport(): Transport {
        return Airplane()
    }
}