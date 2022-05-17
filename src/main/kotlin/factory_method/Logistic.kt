package factory_method

abstract class Logistic {
    fun delivery(product: String) {
        val transport: Transport = createTransport()
        transport.delivery(product)
    }

    abstract fun createTransport(): Transport
}