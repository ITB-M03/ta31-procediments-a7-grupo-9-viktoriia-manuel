package controllers.A7_EJ5

import java.util.*


/**
 * Tipo de dato donde se van añadiendo valores y se van quitando en el
 * orden inverso en el que se han añadido. Para eso crearemos un array
 * en el que almacenaremos los valores
 *
 * @since 11/12/2024
 * @version 1.0
 * @author Manuel Félix
 */

data class Pila(
    val tamanyo: Int = 10,
    val array: IntArray = IntArray(10),
    var ultimoElemento: Int = -1)

/**
 * Función principal que gestiona la ejecución del programa.
 * El usuario podrá interactuar con la pila a través del menú, añadiendo números,
 * quitándolos, mostrando el contenido o saliendo del programa.
 *
 * @since 11/12/2024
 * @version 1.0
 * @author Manuel Félix
 */
fun main(){
    val scan = abrirScanner() // abre el scanner
    val pila = Pila() // crea una instancia de la pila con los valores predeterminados
    manejarOpciones(scan, pila) // llama a la función que maneja las opciones del menú
    cerrarScanner(scan) // cierra el scanner
}

/**
 * Función que abre el Scanner para poder recibir entradas del usuario
 * @version 1.0
 * @return devuelve la variable creada con el scanner
 * @author Manuel Félix
 */

fun abrirScanner(): Scanner {
    val scan = Scanner(System.`in`)
    return scan
}

/**
 * Función que muestra el menú principal del programa con las opciones disponibles.
 * @version 1.0
 * @author Manuel Félix
 */
fun menu() {
    println("-¿Qué deseas hacer?-")
    println("1. Añadir un número (push)")
    println("2. Quitar un número (pop)")
    println("3. Mostrar contenido de la pila")
    println("4. Salir")
    print("Selecciona una opción del 1 al 4: ")
}

/**
 * Función que se encarga de manejar las opciones que el usuario elige en el menú.
 * El programa sigue ejecutándose hasta que el usuario elige salir.
 * No retorna ningún valor.
 * @param scan el Scanner para leer la entrada del usuario.
 * @param pila la pila en la que se almacenan los números.
 * @author Manuel Félix
 */
fun manejarOpciones(scan: Scanner, pila: Pila) {
    var salir = false
    while (!salir) {
        menu()
        when (scan.nextInt()) {
            1 -> {
                println("Introduce el número que quieres añadir a la pila:")
                val numero = scan.nextInt()
                push(numero, pila)
            }
            2 -> pop(pila)
            3 -> mostrarContenidoPila(pila)
            4 -> {
                salir = true
                println("El programa se ha cerrado correctamente. ¡Gracias!")
            }
            else -> println("Esta opción no es válida.")
        }
    }
}

/**
 * Función que añade un número a la pila si no está llena.
 * No retorna ningún valor.
 * @param numero Número que se quiere añadir a la pila.
 * @param pila Instancia de la pila donde se añadirá el número.
 * @author Manuel Félix
 */
fun push(numero: Int, pila: Pila){
    if (pila.ultimoElemento < pila.tamanyo - 1){
        pila.ultimoElemento++
        pila.array[pila.ultimoElemento] = numero
        println("Número $numero añadido a la pila correctamente.")
    }
    else {
        println("El número no ha podido añadirse. La pila está completa.")
    }
}

/**
 * Función que quita el número en el tope de la pila si no está vacía.
 * No retorna ningún valor.
 * @param pila Instancia de la pila donde se eliminará el número.
 * @version 1.0
 * @author Manuel Félix
 */
fun pop(pila: Pila){
    if (pila.ultimoElemento >= 0){
        val numero = pila.array[pila.ultimoElemento]
        pila.ultimoElemento--
        println("Número $numero eliminado de la pila.")
    }
    else{
        println("La pila está vacía, es imposible eliminar elementos.")
    }
}

/**
 * Función que muestra por pantalla el contenido completo de la pila
 * No retorna ningún valor.
 * @param pila Instancia de la pila donde mostrará el contenido
 * @version 1.0
 * @author Manuel Félix
 */
fun mostrarContenidoPila(pila: Pila) {
    if (pila.ultimoElemento == -1){
        println("La pila está vacía.")
    }
    else{
        println("Contenido de la pila:")
        for (i in 0 .. pila.ultimoElemento){
            val contenidoPila = pila.array[i]
            println(contenidoPila)
        }
    }
}

/**
 * Función que cierra el scanner cuando ya no es necesario
 * @version 1.0
 * @author Manuel Félix
 *
 */
fun cerrarScanner(scanner: Scanner) {
    scanner.close()
}