


class GestorMenuUsuario(): ConsoleSystem(), IMenu {

    fun selectorMenuUsuario(){
        var opcion: Int

        do{
            mostrarMenu()
            opcion = lector("Please, insert a number: ")

            when(opcion){
                1 -> generarSerie()
                2 -> TODO()
                else -> { escritor("Esa opción no es válida. Saliendo del programa.")}

            }

        }while (opcion != 3)
    }

    override fun mostrarMenu() {
        escritor("Menu usuario:")
        escritor("1. Generar serie")
        escritor("2. Jugar al ahorcado")
        escritor("3. Salir")
        escritor("Por favor, seleccione una opción: ")
    }

    override fun generarSerie() {
        val generarSerie = GenerarSerie()
        generarSerie.generarSerie()
    }

    override fun jugarAhorcado() {
        TODO("Not yet implemented")
    }
}