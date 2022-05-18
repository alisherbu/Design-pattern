package factory_method

class Airplane : Transport {

    override fun delivery(product: String) {
        println(
            if (product.isEmpty()) "No baggage"
            else "$product successfully delivered with Plane"
        )
    }
}