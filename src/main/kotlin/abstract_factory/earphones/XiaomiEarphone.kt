package abstract_factory.earphones

class XiaomiEarphone : Earphone {
    override fun play(volume: Int) {
        println("Listening music... Volume=$volume")
    }
}