package abstract_factory.earphones

class AppleEarphone : Earphone {
    override fun play(volume: Int) {
        println("Listening music... Volume=$volume")
    }
}