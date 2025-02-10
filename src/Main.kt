import classes.*

fun main() {
    // * Automóviles
    val auto1 = Automovil("Sedán", "Toyota", "Corolla", 50)
    val auto2 = Automovil("SUV", "Honda", "CR-V", 60)

    // * Motocicletas
    val moto1 = Motocicleta(700, "Yamaha", "MT-07", 15)
    val moto2 = Motocicleta(400, "Kawasaki", "Ninja 400", 14)

    val vehiculos: List<Vehiculo> = listOf(auto1, auto2, moto1, moto2)

    for (vehiculo in vehiculos) {
        vehiculo.mostrarInformacion()
        println("Autonomía: ${vehiculo.calcularAutonomia()} km")
        println()
    }
}