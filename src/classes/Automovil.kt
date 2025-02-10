package classes



class Automovil(var tipo: String, marca: String, modelo: String, capacidadCombustible: Int) : Vehiculo(marca, modelo, capacidadCombustible) {

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() + 100
    }

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Tipo: $tipo")
    }
}