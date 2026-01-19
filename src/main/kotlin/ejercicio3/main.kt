package ejercicio3

import ejercicio2.Persona

fun main() {
    val personas = listOf(
        Persona("Julia", 64.7, 1.72),
        Persona("Carlos", 85.0, 1.82),
        Persona("Ana", 55.0, 1.60),
        Persona("Miguel", 72.0, 1.70),
        Persona("Elena", 95.0, 1.65)
    )

    println("--- REPORTE ---")
    for (p in personas) {
        println(p.saludar())
        println(p.obtenerDesc())
    }
}