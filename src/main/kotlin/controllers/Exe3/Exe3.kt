////package controllers.Exe3
////
////import java.util.*
////
////// Contraseña almacenada en una constante interna
////const val contrasena_guardada = "secret"
////
////fun main() {
////    // Abrir el scanner
////    val scanner: Scanner = abrirScanner()
////
////    // Llamar a la función para pedie contraseña
////    val contrasenyaInput = pedirContrasena(scanner)
////
////    // Llamar a la función para validar el superusuario
////    val acceder = validarSuperusuari(contrasenyaInput)
////
////    // Llamar a la función para mostrar el resultado
////    mostrarResultado(acceder)
////
////    // Cerrar el scanner
////    cerrarScanner(scanner)
////}
////
////
/////**
//// * Función para validar la contraseña del superusuario.
//// * Esta función solicita al usuario la contraseña de superusuario y la valida en
//// * hasta tres intentos. Si el usuario introduce la contraseña correcta, devuelve
//// * `true`, de lo contrario devuelve `false` después de 3 intentos fallidos.
//// * @author Viktoriia
//// * @version 1.0
//// * @param scanner El objeto `Scanner` utilizado para leer la entrada del usuario.
//// * @return `true` si la contraseña es correcta, `false` si se agotaron los intentos.
//// */
////fun validarSuperusuari(contrasenyaInput : String): Boolean {
////    var intents = 0
////    var res = false
////    // Intentar hasta 3 veces
////    while (intents < 3 && res != true) {
////        // Comprobar si la contraseña es correcta
////        if (contrasenyaInput == contrasena_guardada) {
////            res = true // Contraseña correcta
////        } else {
////            println("Contraseña incorrecta. Inténtalo de nuevo.")
////        }
////        intents++
////    }
////    return res
////}
////
/////**
//// * Función para pedir la contraseña de superusuario.
//// * Solicita al usuario que ingrese la contraseña de superusuario.
//// * @author Viktoriia
//// * @version 1.0
//// * @param scanner El objeto `Scanner` utilizado para leer la entrada del usuario.
//// * @return La contraseña introducida por el usuario como un `String`.
//// */
////fun pedirContrasena(scanner: Scanner): String {
////    // Pedir la contraseña al usuario
////    print("Introduce la contraseña de superusuario: ")
////    var conracenia = scanner.nextLine() // Leer la entrada del usuario
////    return conracenia
////}
////
/////**
//// * Función para mostrar el resultado del intento de acceso.
//// * Muestra un mensaje en la consola indicando si el acceso fue concedido o denegado
//// * dependiendo del valor de la variable `acceder`.
//// * @author Viktoriia
//// * @version 1.0
//// * @param acceder Booleano que indica si el acceso fue concedido (`true`) o denegado (`false`).
//// */
////fun mostrarResultado(acceder: Boolean) {
////    if (acceder) {
////        println("Acceso concedido al superusuario.")
////    } else {
////        println("Acceso denegado. Has agotado los intentos.")
////    }
////}
////
////
/////**
//// * Función para abrir un scanner.
//// * Esta función crea y devuelve un objeto `Scanner` que permite leer la entrada del usuario
//// * desde la consola.
//// * @author Viktoriia
//// * @version 1.0
//// * @return Un objeto `Scanner` abierto para la lectura de entradas.
//// */
////fun abrirScanner(): Scanner {
////    val scanner = Scanner(System.`in`).useLocale(Locale.UK)
////    return scanner
////}
////
/////**
//// * Función para cerrar un scanner.
//// * Cierra el objeto `Scanner` para liberar recursos.
//// * @author Viktoriia
//// * @version 1.0
//// * @param scanner El objeto `Scanner` a cerrar.
//// */
////fun cerrarScanner(scanner: Scanner) {
////    scanner.close()
////}
//
//package controllers.Exe3
//
//import java.util.*
//
//// Contraseña almacenada en una constante interna
//const val contrasena_guardada = "secret"
//
//fun main() {
//    // Abrir el scanner
//    val scanner: Scanner = abrirScanner()
//
//    // Llamar a la función para pedir la contraseña
//    val contrasenaInput = pedirContrasena(scanner)
//
//    // Llamar a la función para validar el superusuario
//    val accesoConcedido = validarSuperusuario(contrasenaInput, scanner)
//
//    // Llamar a la función para mostrar el resultado
//    mostrarResultado(accesoConcedido)
//
//    // Cerrar el scanner
//    cerrarScanner(scanner)
//}
//
///**
// * Función para validar la contraseña del superusuario.
// * Esta función valida la contraseña ingresada y permite hasta tres intentos.
// * Si el usuario introduce la contraseña correcta, devuelve `true`, de lo contrario,
// * devuelve `false` después de 3 intentos fallidos.
// * @param contrasenaInput La contraseña inicial ingresada por el usuario.
// * @param scanner El objeto `Scanner` utilizado para leer entradas adicionales.
// * @return `true` si la contraseña es correcta, `false` si se agotaron los intentos.
// */
//fun validarSuperusuario(contrasenaInput: String, scanner: Scanner): Boolean {
//    var intentos = 1
//    var contrasenaActual = contrasenaInput
//
//    while (intentos <= 3) {
//        if (contrasenaActual == CONTRASENA_GUARDADA) {
//            return true // Contraseña correcta
//        } else if (intentos < 3) {
//            println("Contraseña incorrecta. Inténtalo de nuevo.")
//            contrasenaActual = pedirContrasena(scanner)
//        }
//        intentos++
//    }
//
//    return false // Se agotaron los intentos
//}
//
///**
// * Función para pedir la contraseña de superusuario.
// * Solicita al usuario que ingrese la contraseña de superusuario.
// * @param scanner El objeto `Scanner` utilizado para leer la entrada del usuario.
// * @return La contraseña introducida por el usuario como un `String`.
// */
//fun pedirContrasena(scanner: Scanner): String {
//    print("Introduce la contraseña de superusuario: ")
//    return scanner.nextLine()
//}
//
///**
// * Función para mostrar el resultado del intento de acceso.
// * Muestra un mensaje en la consola indicando si el acceso fue concedido o denegado.
// * @param acceder Booleano que indica si el acceso fue concedido (`true`) o denegado (`false`).
// */
//fun mostrarResultado(acceder: Boolean) {
//    if (acceder) {
//        println("Acceso concedido al superusuario.")
//    } else {
//        println("Acceso denegado. Has agotado los intentos.")
//    }
//}
//
///**
// * Función para abrir un scanner.
// * Crea y devuelve un objeto `Scanner` que permite leer la entrada del usuario.
// * @return Un objeto `Scanner` abierto para la lectura de entradas.
// */
//fun abrirScanner(): Scanner {
//    return Scanner(System.`in`).useLocale(Locale.UK)
//}
//
///**
// * Función para cerrar un scanner.
// * Cierra el objeto `Scanner` para liberar recursos.
// * @param scanner El objeto `Scanner` a cerrar.
// */
//fun cerrarScanner(scanner: Scanner) {
//    scanner.close()
//}
//
//
//
//
