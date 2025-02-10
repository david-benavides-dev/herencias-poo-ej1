package classes

class Motocicleta(private var cilindrada: Int, marca: String, modelo: String, capacidadCombustible: Int) : Vehiculo(marca, modelo, capacidadCombustible) {

    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40
    }

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Cilindrada: $cilindrada cc")
    }
}