package ejercicio1

class Rectangulo(val base: Double, val altura: Double) {

    init {
        require(base > 0 && altura > 0) { "La base y la altura deben ser mayores que 0" }
    }

    fun calcularArea(): Double {
        return base * altura
    }

    fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }

    override fun toString(): String {
        return "Rectángulo(base=$base, altura=$altura)"
    }
}