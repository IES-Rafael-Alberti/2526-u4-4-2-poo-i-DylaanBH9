package ejercicio2

class Persona(var peso: Double, var altura: Double) {
    var nombre: String = "Sin nombre"

    val imc: Double
        get() = peso / (altura * altura)

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    fun saludar(): String {
        return "Hola, soy $nombre"
    }

    private fun alturaEncimaMedia(): Boolean {
        return altura >= 1.75
    }

    private fun pesoEncimaMedia(): Boolean {
        return peso >= 70
    }

    private fun obtenerDescImc(): String {
        return when {
            imc < 18.5 -> "peso insuficiente"
            imc in 18.5..24.9 -> "peso saludable"
            imc in 25.0..29.9 -> "sobrepeso"
            else -> "obesidad"
        }
    }

    fun obtenerDesc(): String {
        val descAltura = if (alturaEncimaMedia()) "Por encima de la media" else "Por debajo de la media"
        val descPeso = if (pesoEncimaMedia()) "Por encima de la media" else "Por debajo de la media"
        val descImc = obtenerDescImc()

        return "$nombre con una altura de ${altura}m ($descAltura) y un peso ${peso}kg ($descPeso) tiene un IMC de $imc ($descImc)."
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre', peso=$peso, altura=$altura, imc=$imc)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        if (nombre != other.nombre) return false
        if (peso != other.peso) return false
        if (altura != other.altura) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nombre.hashCode()
        result = 31 * result + peso.hashCode()
        result = 31 * result + altura.hashCode()
        return result
    }
}