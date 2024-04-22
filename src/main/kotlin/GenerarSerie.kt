import kotlin.math.abs


class GenerarSerie(private val consola: Consola){

    private val MIN = 1
    private val MAX = 100
    private val RANGO_MIN = 30


    fun generarSerie() {
        val listaOrdenada = generarRango().sorted()
        val numPedido = consola.lector("Inserte un número [${listaOrdenada[1]} - ${listaOrdenada[0]}] ->")

        when(masCercano(numPedido, listaOrdenada[0], listaOrdenada[1])){

            listaOrdenada[0] -> {   consola.escritor("Inserte un número [${listaOrdenada[1]} - ${listaOrdenada[0]}] -> $numPedido")
                                    serieDecreciente(listaOrdenada[0], listaOrdenada[1])}

            listaOrdenada[1] -> {   consola.escritor("Inserte un número [${listaOrdenada[1]} - ${listaOrdenada[0]}] -> $numPedido")
                                    serieCreciente(listaOrdenada[1], listaOrdenada[0])}

            else -> {consola.escritor("Ese número no es válido. Pruebe de nuevo: ${generarSerie()}")}
        }
    }

    private fun generarNum() = (MIN..MAX).random()


    private fun generarRango(): List<Int>{
        val num1: Int = generarNum()
        var num2: Int = generarNum()

        consola.escritor("Se está generando un rango aleatorio...")
        consola.escritor(". . .")

        while(abs(num1 - num2) < RANGO_MIN){
            num2 = generarNum()

        }
        return listOf(num1, num2)
    }

    private fun serieCreciente(num1: Int, num2: Int){
        var suma = 0
        var serie = (num1..num2).toString()
        var listaVaciaSerie = mutableListOf<String>()

        serie.forEach{
            listaVaciaSerie.add("$it +")
            suma += 1
        }

    }

    private fun serieDecreciente(num1: Int, num2: Int){
        TODO()
    }


    fun masCercano(numero: Int, a: Int, b: Int): Int {
        val distanciaHastaA = Math.abs(numero - a)
        val distanciaHastaB = Math.abs(numero - b)

        return if (distanciaHastaA < distanciaHastaB) a else b
    }
}