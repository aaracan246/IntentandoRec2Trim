class Ahorcado(val intentosMax: Int = 5, palabra: Palabra) {


    private val palabraOculta = palabra.obtenerPalabraAleatoria()


    fun jugar(){
        println(palabraOculta)
    }
}

