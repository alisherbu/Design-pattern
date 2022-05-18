package abstract_factory.earphones

class SamsungEarphone:Earphone {
    override fun play(volume: Int) {
        println("Listening music... Volume=$volume")
    }
}