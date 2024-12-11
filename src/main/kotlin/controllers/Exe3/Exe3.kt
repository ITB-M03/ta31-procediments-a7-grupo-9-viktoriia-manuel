package controllers.Exe3

import java.util.*

// Contraseña almacenada en una constante interna
const val contrasena_guardada = "secret"

fun main() {
    // Abrir el scanner
    val scanner: Scanner = abrirScanner()

    // Llamar a la función para validar el superusuario y obtener el resultado
    val acceder = validarSuperusuari(scanner)

    // Llamar a la función para mostrar el resultado
    mostrarResultado(acceder)

    // Cerrar el scanner
    cerrarScanner(scanner)
}


/**
 * Función para validar la contraseña del superusuario.
 * Esta función solicita al usuario la contraseña de superusuario y la valida en
 * hasta tres intentos. Si el usuario introduce la contraseña correcta, devuelve
 * `true`, de lo contrario devuelve `false` después de 3 intentos fallidos.
 * @author Viktoriia
 * @version 1.0
 * @param scanner El objeto `Scanner` utilizado para leer la entrada del usuario.
 * @return `true` si la contraseña es correcta, `false` si se agotaron los intentos.
 */
fun validarSuperusuari(scanner: Scanner): Boolean {
    var intents = 0

    // Intentar hasta 3 veces
    while (intents < 3) {
        // Pedir la contraseña utilizando la función pedirContrasena
        val contrasenyaInput = pedirContrasena(scanner)

        // Comprobar si la contraseña es correcta
        if (contrasenyaInput == contrasena_guardada) {
            return true // Contraseña correcta
        } else {
            println("Contraseña incorrecta. Inténtalo nuevamente.")
        }
        intents++
    }
    return false // Si se agotaron los intentos
}

/**
 * Función para pedir la contraseña de superusuario.
 * Solicita al usuario que ingrese la contraseña de superusuario.
 * @author Viktoriia
 * @version 1.0
 * @param scanner El objeto `Scanner` utilizado para leer la entrada del usuario.
 * @return La contraseña introducida por el usuario como un `String`.
 */
fun pedirContrasena(scanner: Scanner): String {
    // Pedir la contraseña al usuario
    print("Introduce la contraseña de superusuario: ")
    return scanner.nextLine() // Leer la entrada del usuario
}

/**
 * Función para mostrar el resultado del intento de acceso.
 * Muestra un mensaje en la consola indicando si el acceso fue concedido o denegado
 * dependiendo del valor de la variable `acceder`.
 * @author Viktoriia
 * @version 1.0
 * @param acceder Booleano que indica si el acceso fue concedido (`true`) o denegado (`false`).
 */
fun mostrarResultado(acceder: Boolean) {
    if (acceder) {
        println("Acceso concedido al superusuario.")
    } else {
        println("Acceso denegado. Has agotado los intentos.")
    }
}

/*-------------------------------------------------------------------------------*/

/**
 * Función para abrir un scanner.
 * Esta función crea y devuelve un objeto `Scanner` que permite leer la entrada del usuario
 * desde la consola.
 * @author Viktoriia
 * @version 1.0
 * @return Un objeto `Scanner` abierto para la lectura de entradas.
 */
fun abrirScanner(): Scanner {
    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
    return scanner
}

/**
 * Función para cerrar un scanner.
 * Cierra el objeto `Scanner` para liberar recursos.
 * @author Viktoriia
 * @version 1.0
 * @param scanner El objeto `Scanner` a cerrar.
 */
fun cerrarScanner(scanner: Scanner) {
    scanner.close()
}
