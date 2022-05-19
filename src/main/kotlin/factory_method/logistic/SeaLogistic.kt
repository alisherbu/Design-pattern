package factory_method.logistic

import factory_method.transport.Boat
import factory_method.transport.Transport

class SeaLogistic : Logistic() {
    override fun createTransport(): Transport {
        return Boat()
    }
}