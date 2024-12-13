package controllers.Exe1

import java.util.*
import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * Función principal que llama al procedimiento calcularIVA.
 * @since 13/12/2024
 * @author Viktoriia Ponomarenko
 */
fun main() {
    // Abrir scanner
    val scanner: Scanner = abrirScanner()

    // Pedir datos
    val precio = pedirDouble("Introduce el precio: ", scanner)
    val tipoIVA = pedirString("Introduce el tipo de IVA (General, Reducido, Superreducido, Exento): ", scanner)
    val fechaCompra = pedirString("Introduce la fecha de compra (formato dd-MM-yyyy): ", scanner)

    // Calcular y mostrar resultado
    try {
        val precioConIVA = calcularIVA(precio, tipoIVA, fechaCompra)
        println("El precio con IVA es: %.2f €".format(precioConIVA))
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }

    // Cerrar scanner
    cerrarScanner(scanner)
}

/**
 * Función para calcular el precio con IVA
 * @param precio El precio base del producto
 * @param tipoIVA El tipo de IVA a aplicar (General, Reducido, Superreducido, Exento)
 * @param fechaCompra La fecha de compra en formato dd-MM-yyyy
 * @return El precio con el IVA aplicado
 * @author Viktoriia
 *
 */
fun calcularIVA(precio: Double, tipoIVA: String, fechaCompra: String): Double {
    val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val fecha = LocalDate.parse(fechaCompra, formatter)

    val porcentajeIVA = when {
        fecha >= LocalDate.of(2012, 7, 15) -> when (tipoIVA) {
            "General" -> 21.0
            "Reducido" -> 10.0
            "Superreducido" -> 4.0
            else -> 0.0
        }
        fecha >= LocalDate.of(2010, 1, 1) -> when (tipoIVA) {
            "General" -> 18.0
            "Reducido" -> 8.0
            "Superreducido" -> 4.0
            else -> 0.0
        }
        fecha >= LocalDate.of(1995, 1, 1) -> when (tipoIVA) {
            "General" -> 16.0
            "Reducido" -> 7.0
            "Superreducido" -> 4.0
            else -> 0.0
        }
        fecha >= LocalDate.of(1993, 1, 1) -> when (tipoIVA) {
            "General" -> 15.0
            "Reducido" -> 6.0
            "Superreducido" -> 3.0
            else -> 0.0
        }
        fecha >= LocalDate.of(1992, 1, 1) -> when (tipoIVA) {
            "General" -> 15.0
            "Reducido" -> 6.0
            else -> 0.0
        }
        else -> when (tipoIVA) {
            "General" -> 12.0
            "Reducido" -> 6.0
            else -> 0.0
        }
    }

    return precio * (1 + porcentajeIVA / 100)
}

/**
 * Función para pedir un número decimal
 * @param msg Mensaje para mostrar al usuario
 * @param scanner Scanner para leer la entrada
 * @return El número introducido por el usuario
 * @author Viktoriia
 */
fun pedirDouble(msg: String, scanner: Scanner): Double {
    print(msg)
    return scanner.nextDouble()
}

/**
 * Función para pedir una cadena de texto
 * @param msg Mensaje para mostrar al usuario
 * @param scanner Scanner para leer la entrada
 * @return La cadena introducida por el usuario
 * @author Viktoriia
 */
fun pedirString(msg: String, scanner: Scanner): String {
    print(msg)
    return scanner.next()
}

/**
 * Función para abrir un scanner
 * @return Un nuevo objeto Scanner para leer datos
 * @author Viktoriia
 */
fun abrirScanner(): Scanner {
    return Scanner(System.`in`)
}

/**
 * Función para cerrar un scanner
 * @param scanner El objeto Scanner a cerrar
 * @author Viktoriia
 */
fun cerrarScanner(scanner: Scanner) {
    scanner.close()
}
