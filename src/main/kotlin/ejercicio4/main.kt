package ejercicio4

fun main() {
    try {
        println("Coche válido: ")
        val cocheValido = Coche("Rojo", "toyota", "yaris", 100, 5, "1234ABC")
        println(cocheValido)
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }

    try {
        println("Coche con marca vacía: ")
        val cocheError = Coche("Azul", "", "Clio", 90, 5, "1234ABC")
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }

    try {
        println("Coche con 20 caballos: ")
        val cocheError = Coche("Verde", "Seat", "Ibiza", 20, 3, "1234ABC")
    } catch (e: IllegalArgumentException) {
        println("ERROR : ${e.message}")
    }

    try {
        println("Coche con 6 puertas: ")
        val cocheError = Coche("Negro", "Ford", "Fiesta", 100, 6, "1234ABC")
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }

    try {
        println("Coche con matrícula de 3 letras: ")
        val cocheError = Coche("Blanco", "Audi", "A3", 150, 3, "ABC")
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }

    try {
        println("Modificar color a null: ")
        val miCoche = Coche("Gris", "BMW", "X1", 150, 5, "9999ZZZ")
        println("Coche creado: $miCoche")
        println("Asignando color null: ")
        miCoche.color = null
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }
}