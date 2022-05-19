package factory_method.logistic

import factory_method.transport.Car
import factory_method.transport.Transport

class RoadLogistic : Logistic() {
    override fun createTransport(): Transport {
        return Car()
    }
}