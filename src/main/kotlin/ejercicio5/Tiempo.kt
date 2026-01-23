package ejercicio5

class Tiempo(horaStr: String, minutoStr: String = "0", segundoStr: String = "0") {

    var hora: Int = horaStr.toIntOrNull() ?: throw IllegalArgumentException("Hora inválida")

    var minuto: Int = if (minutoStr.isBlank()) 0 else (minutoStr.toIntOrNull() ?: throw IllegalArgumentException("Minutos inválidos"))

    var segundo: Int = if (segundoStr.isBlank()) 0 else (segundoStr.toIntOrNull() ?: throw IllegalArgumentException("Segundos inválidos"))

    init {
        require(hora in 0..23) { "La hora debe estar entre 0 y 23" }
        require(minuto in 0..59) { "Los minutos deben estar entre 0 y 59" }
        require(segundo in 0..59) { "Los segundos deben estar entre 0 y 59" }
    }

    override fun toString(): String {
        return "${hora}h ${minuto}m ${segundo}s "
    }

    private fun obtenerSegundos(): Int {
        return (hora * 3600) + (minuto * 60) + segundo
    }

    private fun actualizarTiempoConSegundos(total: Int) {
        this.hora = total / 3600
        val resto = total % 3600
        this.minuto = resto / 60
        this.segundo = resto % 60
    }

    fun incrementar(t: Tiempo): Boolean {
        val nuevoTotal = this.obtenerSegundos() + t.obtenerSegundos()
        if (nuevoTotal >= 86400) return false // 86400s = 24h

        actualizarTiempoConSegundos(nuevoTotal)
        return true
    }

    fun decrementar(t: Tiempo): Boolean {
        val nuevoTotal = this.obtenerSegundos() - t.obtenerSegundos()
        if (nuevoTotal < 0) return false

        actualizarTiempoConSegundos(nuevoTotal)
        return true
    }

    fun comparar(t: Tiempo): Int = this.obtenerSegundos().compareTo(t.obtenerSegundos())

    fun copiar(): Tiempo = Tiempo(hora.toString(), minuto.toString(), segundo.toString())

    fun copiar(t: Tiempo): Tiempo {
        this.hora = t.hora
        this.minuto = t.minuto
        this.segundo = t.segundo
        return this
    }

    fun sumar(t: Tiempo): Tiempo? {
        val total = this.obtenerSegundos() + t.obtenerSegundos()
        if (total >= 86400) return null
        return Tiempo((total / 3600).toString(), ((total % 3600) / 60).toString(), ((total % 3600) % 60).toString())
    }

    fun restar(t: Tiempo): Tiempo? {
        val total = this.obtenerSegundos() - t.obtenerSegundos()
        if (total < 0) return null
        return Tiempo((total / 3600).toString(), ((total % 3600) / 60).toString(), ((total % 3600) % 60).toString())
    }

    fun esMayorQue(t: Tiempo): Boolean = this.obtenerSegundos() > t.obtenerSegundos()
    fun esMenorQue(t: Tiempo): Boolean = this.obtenerSegundos() < t.obtenerSegundos()
}