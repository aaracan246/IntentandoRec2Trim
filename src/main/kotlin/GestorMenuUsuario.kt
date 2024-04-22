


class GestorMenuUsuario(val consola: Consola): IMenu {

    fun selectorMenuUsuario(){
        var opcion: Int

        do{
            mostrarMenu()
            opcion = consola.lector("Please, insert a number: ")

            when(opcion){
                1 -> generarSerie()
                2 -> TODO()
                else -> { consola.escritor("Esa opción no es válida. Saliendo del programa.")}

            }

        }while (opcion != 3)
    }

    override fun mostrarMenu() {
        consola.escritor("Menu usuario:")
        consola.escritor("1. Generar serie")
        consola.escritor("2. Jugar al ahorcado")
        consola.escritor("3. Salir")
        consola.escritor("Por favor, seleccione una opción: ")
    }

    override fun generarSerie() {
        val generarSerie = GenerarSerie(consola)
        generarSerie.generarSerie()
    }

    override fun jugarAhorcado() {
        TODO("Not yet implemented")
    }
}