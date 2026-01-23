package ejercicio2

fun main() {
    val persona1 = Persona(70.0, 1.75)

    val persona2 = Persona("Ana", 60.0, 1.65)
    val persona3 = Persona("Luis", 80.0, 1.85)

    println("Estado Inicial: ")
    println(persona1)
    println(persona2)
    println(persona3)

    println("Acciones Persona 1: ")
    var nuevoNombre: String

    do {
        print("Introduce el nombre para la Persona 1: ")
        nuevoNombre = readlnOrNull()?.trim() ?: ""

        if (nuevoNombre.isEmpty()) {
            println("El nombre no puede estar vacío. Inténtalo de nuevo.")
        }
    } while (nuevoNombre.isEmpty())

    persona1.nombre = nuevoNombre
    println(persona1)

    println("Acciones Persona 3: ")
    println(persona3)

    persona3.altura = 1.80

    println(persona3)

    println("Acciones Persona 2: ")
    persona2.altura = persona3.altura

    println("Persona 2: $persona2")
    println("Persona 3: $persona3")

    println("Es Persona 2 igual a Persona 3?")
    if (persona2 == persona3) {
        println("Resultado: SÍ, son iguales.")
    } else {
        println("Resultado: NO, son diferentes.")
    }
}