

class GenerarSerie: ConsoleSystem(){

    fun generarSerie() {
        val num1 = generarNum()
        val num2 = num1 + 30

        escritor("Se está generando un rango aleatorio...")
        escritor(". . .")

        val numPedido = lector("Inserte un número [$num1 - $num2] ->")
        when(numPedido){
            in 1..50 -> serieDecreciente(num2, num1)

            in 51..100 -> serieCreciente(num1, num2)

            else -> {escritor("Ese número no es válido. Pruebe de nuevo: ${generarSerie()}")}
        }
    }

    private fun generarNum() = (1..70).random()



    private fun serieCreciente(num1: Int, num2: Int){
        val rangoNums: IntRange = (num1..num2)
        escritor("${rangoNums.forEach { escritor("${it + it + 1}") }}")

    }

    private fun serieDecreciente(num1: Int, num2: Int){
        val rangoNums: IntRange = (num2..num1)
        escritor("${rangoNums.forEach { escritor("${it + it + 1}") }}")
    }

}