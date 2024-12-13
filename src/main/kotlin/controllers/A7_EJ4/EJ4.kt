package controllers.A7_EJ4

import java.util.Scanner

/**
 * Función principal que llama al procedimiento titol para mostrar el texto centrado.
 * Lee la frase que introduce el usuario y la centra
 *
 * @since 10/12/2024
 * @autor Manuel Félix
 */
fun main() {
    val scan = abrirScanner() // Abrimos el Scanner
    println("Introduce la frase que quieres centrar:")
    val texto = scan.nextLine() // Leemos la línea completa del usuario
    titol(texto) // Centramos el texto
    cerrarScanner(scan) // Cerramos el Scanner
}

/**
 * Función que abre el Scanner para poder recibir entradas del usuario.
 *
 * @version 1.0
 * @return Devuelve el Scanner creado.
 * @author Manuel Félix
 */
fun abrirScanner(): Scanner {
    return Scanner(System.`in`)
}

/**
 * Función que cierra el Scanner cuando ya no es necesario.
 *
 * @version 1.0
 * @param scanner El Scanner que se quiere cerrar.
 * @author Manuel Félix
 */
fun cerrarScanner(scanner: Scanner) {
    scanner.close()
}

/**
 * Calcula los espacios laterales necesarios para centrar el texto en la pantalla.
 *
 * @param texto El texto que se quiere centrar.
 * @param anchoPantalla El ancho de la pantalla en la que se quiere centrar el texto.
 * @return El número de espacios que debe tener el texto a cada lado para centrarlo.
 *
 * @version 1.0
 * @autor Manuel Félix
 */
fun calcularEspaciosLaterales(texto: String, anchoPantalla: Int): Int {
    val espaciosLaterales = (anchoPantalla - texto.length) / 2
    return espaciosLaterales
}

/**
 * Muestra el texto centrado en la pantalla, utilizando el ancho especificado.
 *
 * @param texto El texto que se quiere mostrar centrado.
 * @version 1.0
 * @autor Manuel Félix
 */
fun titol(texto: String) {
    val anchoPantalla = 80
    val espaciosLaterales = calcularEspaciosLaterales(texto, anchoPantalla)
    println(" ".repeat(espaciosLaterales) + texto)
}
