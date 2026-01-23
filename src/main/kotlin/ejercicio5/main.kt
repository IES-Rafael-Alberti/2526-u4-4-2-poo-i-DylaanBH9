package ejercicio5

fun main() {
    println("Introduce las horas: ")
    val horas = readln()
    println("Introduce los minutos: ")
    val minutos = readln()
    println("Introduce los segundos: ")
    val segundos = readln()

    try {
        val t1 = Tiempo(horas, minutos, segundos)
        println(t1)
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }

}