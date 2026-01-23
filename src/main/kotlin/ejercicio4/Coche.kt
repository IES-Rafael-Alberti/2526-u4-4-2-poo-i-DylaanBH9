package ejercicio4

class Coche(
    color: String?,
    marca: String?,
    modelo: String?,
    val numCaballos: Int?,
    val numPuertas: Int?,
    val matricula: String?
) {

    var color: String? = color
        set(value) {
            require(value != null) { "El color no puede ser nulo" }
            field = value
        }

    val marca: String? = marca
        get() = field?.replaceFirstChar { it.uppercase() }

    val modelo: String? = modelo
        get() = field?.replaceFirstChar { it.uppercase() }

    init {
        require(this.color != null) { "El color inicial no puede ser nulo" }

        require(!this.marca.isNullOrBlank()) { "La marca no puede ser nula ni vacía" }
        require(!this.modelo.isNullOrBlank()) { "El modelo no puede ser nulo ni vacío" }

        require(this.numCaballos != null) { "El número de caballos no puede ser nulo" }
        require(this.numCaballos in 70..700) { "El número de caballos debe estar entre 70 y 700" }

        require(this.numPuertas != null) { "El número de puertas no puede ser nulo" }
        require(this.numPuertas in 3..5) { "El número de puertas debe ser entre 3 y 5" }

        require(this.matricula != null) { "La matrícula no puede ser nula" }
        require(this.matricula.length == 7) { "La matrícula debe tener exactamente 7 caracteres" }
    }

    override fun toString(): String {
        return "Coche(marca=$marca, modelo=$modelo, color=$color, caballos=$numCaballos, puertas=$numPuertas, matrícula=$matricula)"
    }
}