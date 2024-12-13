package controllers.Exe3

import java.util.*

// Contraseña almacenada en una constante interna
const val contrasena_guardada = "secret"

fun main() {
    // Abrir el scanner
    val scanner: Scanner = abrirScanner()

    // Llamar a la función para pedir la contraseña
    val contrasenaInput = pedirContrasena(scanner)

    // Llamar a la función para validar el superusuario
    val accesoConcedido = validarSuperusuario(contrasenaInput, scanner)

    // Llamar a la función para mostrar el resultado
    mostrarResultado(accesoConcedido)

    // Cerrar el scanner
    cerrarScanner(scanner)
}

/**
 * Función para validar la contraseña del superusuario.
 * Esta función valida la contraseña ingresada y permite hasta tres intentos.
 * Si el usuario introduce la contraseña correcta, devuelve `true`, de lo contrario,
 * @author Viktoriia
 * devuelve `false` después de 3 intentos fallidos.
 * @param contrasenaInput La contraseña inicial ingresada por el usuario.
 * @param scanner El objeto `Scanner` utilizado para leer entradas adicionales.
 * @return `true` si la contraseña es correcta, `false` si se agotaron los intentos.
 */
fun validarSuperusuario(contrasenaInput: String, scanner: Scanner): Boolean {
    var intentos = 1
    var res = false
    var contrasenaActual = contrasenaInput
    while (intentos <= 3) {
        if (contrasenaActual == contrasena_guardada) {
            res = true // Contraseña correcta
        } else if (intentos < 3) {
            println("Contraseña incorrecta. Inténtalo de nuevo.")
            contrasenaActual = pedirContrasena(scanner)
        }
        intentos++
    }

    return res
}

/**
 * Función para pedir la contraseña de superusuario.
 * Solicita al usuario que ingrese la contraseña de superusuario.
 * @author Viktoriia
 * @param scanner El objeto `Scanner` utilizado para leer la entrada del usuario.
 * @return La contraseña introducida por el usuario como un `String`.
 */
fun pedirContrasena(scanner: Scanner): String {
    // Pedir la contraseña al usuario
    print("Introduce la contraseña de superusuario: ")
    var conracenia = scanner.nextLine() // Leer la entrada del usuario
    return conracenia
}

/**
 * Función para mostrar el resultado del intento de acceso.
 * Muestra un mensaje en la consola indicando si el acceso fue concedido o denegado.
 * @author Viktoriia
 * @param acceder Booleano que indica si el acceso fue concedido (`true`) o denegado (`false`).
 */
fun mostrarResultado(acceder: Boolean) {
    if (acceder) {
        println("Acceso concedido al superusuario.")
    } else {
        println("Acceso denegado. Has agotado los intentos.")
    }
}

/**
 * Función para abrir un scanner.
 * Crea y devuelve un objeto `Scanner` que permite leer la entrada del usuario.
 * @author Viktoriia
 * @return Un objeto `Scanner` abierto para la lectura de entradas.
 */
fun abrirScanner(): Scanner {
    return Scanner(System.`in`).useLocale(Locale.UK)
}

/**
 * Función para cerrar un scanner.
 * Cierra el objeto `Scanner` para liberar recursos.
 * @author Viktoriia
 * @param scanner El objeto `Scanner` a cerrar.
 */
fun cerrarScanner(scanner: Scanner) {
    scanner.close()
}




