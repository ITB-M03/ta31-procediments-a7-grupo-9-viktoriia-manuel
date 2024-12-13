package controllers.A7_EJ4

import java.util.*


/**
 * Función principal que llama al procedimiento titol para mostrar el texto centrado.
 * @since 10/12/2024
 * @author Manuel Felix
 */
fun main(){

    titol("¡Hola! Somos el grupo 9: Manuel y Viktoriia")

}

/**
 * Calcula los espacios laterales necesarios para centrar el texto en la pantalla.
 *
 * @param texto El texto que se quiere centrar.
 * @param anchoPantalla El ancho de la pantalla en la que se quiere centrar el texto.
 * @return El número de espacios que debe tener el texto a cada lado para centrarlo.
 *
 * @author Manuel Felix
 */
fun calcularEspaciosLaterales(texto: String, anchoPantalla: Int): Int{
    val espaciosLaterales = (anchoPantalla - texto.length) / 2
    return espaciosLaterales
}

/**
 * Muestra el texto centrado en la pantalla, utilizando el ancho especificado.
 *
 * @param texto El texto que se quiere mostrar centrado.
 *
 * @author Manuel Felix
 */
fun titol(texto: String){
    val anchoPantalla = 80
    val espaciosLaterales = calcularEspaciosLaterales(texto, anchoPantalla)
    println(" ".repeat(espaciosLaterales) + texto)
}