package controllers.Exe2


import java.util.*

fun main() {
    // Abrir scanner
    val scanner: Scanner = abrirScanner()

    //Pedir numero
    val numero = pedirNumero("Introduzca un número entre 1 y 3999: ", scanner)

    // Cerrar scanner
    cerrarScanner(scanner)

    //imprimir resultado
    if (numero in 1 .. 3999) println(roman(numero))
    else println("El número ha de ser entre 1 i 3999.")
}

/**
 * Función para pedir un número
 *@author Viktoriia
 * @version 1.0
 *@param msg mensaje para imprimir
 * @param scan scanea un número
 * @return el número escaneado
 */
fun pedirNumero(msg: String, scanner: Scanner): Int {
    print(msg)
    val numero = scanner.nextInt()
    return numero
}

/**
 * Convierte un número entero en su equivalente en números romanos.
 * La conversión se realiza utilizando una lista de valores romanos predefinidos. Se comienza con el valor más alto
 * y se resta de manera repetida hasta que el número se convierte completamente en una cadena de caracteres romanos.
 *@author Viktoriia
 * @version 1.0
 * @param numero El número entero a convertir a romano.
 * @return La representación del número en números romanos como una cadena de texto.
 */
fun roman(numero: Int):String {
    val romans = arrayOf(
        1000 to "M", 900 to "CM", 500 to "D", 400 to "CD",
        100 to "C", 90 to "XC", 50 to "L", 40 to "XL",
        10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I"
    )
    var num_romans = ""
    var num = numero
        for (i in romans) {
        while (num >= i.first) {
            num_romans += i.second
            num -= i.first
        }
    }

    return num_romans
}

/**
 * Función para abrir un scanner
 *@author Viktoriia
 * @version 1.0
 * @return hace una variable llamada "scanner" abriendo el Scanner para poder escanear
 */
fun abrirScanner(): Scanner {
    var scanner = Scanner(System.`in`)
    return scanner
}

/**
 * Función para cerrar un scanner
 * @author Viktoriia
 * @version 1.0
 */
fun cerrarScanner(scanner: Scanner) {
    scanner.close()
}


