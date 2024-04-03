open class ConsoleSystem: Console {
    override fun lector(msg: String): Int {
        escritor(msg)
        return readln().toInt()
    }

    override fun escritor(msg: String) {
        println(msg)
    }
}