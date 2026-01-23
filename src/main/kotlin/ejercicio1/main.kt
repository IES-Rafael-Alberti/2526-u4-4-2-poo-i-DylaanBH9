package ejercicio1

fun main() {
    try {
        val rect1 = Rectangulo(10.0, 5.0)
        val rect2 = Rectangulo(4.5, 3.0)
        val rect3 = Rectangulo(12.0, 12.0)

        val listaRectangulos = listOf(rect1, rect2, rect3)

        for (rect in listaRectangulos) {
            println(rect.toString())
            println("Area: ${rect.calcularArea()}")
            println("Perímetro: ${rect.calcularPerimetro()}")
        }

        val rectInvalido = Rectangulo(-5.0, 10.0)

    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }
}