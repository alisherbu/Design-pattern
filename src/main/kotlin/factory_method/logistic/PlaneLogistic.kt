package factory_method.logistic

import factory_method.transport.Airplane
import factory_method.transport.Transport

class PlaneLogistic : Logistic() {
    override fun createTransport(): Transport {
        return Airplane()
    }
}