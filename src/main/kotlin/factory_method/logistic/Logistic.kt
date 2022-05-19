package factory_method.logistic

import factory_method.transport.Transport

abstract class Logistic {
    fun delivery(product: String) {
        val transport: Transport = createTransport()
        transport.delivery(product)
    }

    abstract fun createTransport(): Transport
}