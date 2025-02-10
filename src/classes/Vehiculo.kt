package classes

/**
 * Representa un vehículo con su marca, modelo y capacidad de combustible.
 */
open class Vehiculo(private var marca: String, private var modelo: String, private var capacidadCombustible: Int) {

    /**
     * Muestra la información del vehículo.
     */
    open fun mostrarInformacion() {
        println("Marca del vehículo: $marca\nModelo: $modelo\nCapacidad de combustible: $capacidadCombustible")
    }

    /**
     * Calcula la autonomía del vehículo.
     */
    open fun calcularAutonomia(): Int = capacidadCombustible * 10
}