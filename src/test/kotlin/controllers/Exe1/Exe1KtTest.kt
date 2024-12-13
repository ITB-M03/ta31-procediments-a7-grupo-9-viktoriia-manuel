package controllers.Exe1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
class Exe1KtTest {

    @Test
    fun calcularIVA_generalAfter2012() {
        // Definimos el precio base del producto
        val precio = 100.0
        // Establecemos el tipo de IVA como "General"
        val tipoIVA = "General"
        // Establecemos la fecha de compra como 15 de julio de 2012 (después de la reforma de IVA de 2012)
        val fechaCompra = "15-07-2012"

        // Llamamos a la función calcularIVA para obtener el precio con el IVA aplicado
        val resultado = calcularIVA(precio, tipoIVA, fechaCompra)

        // Comprobamos que el resultado es 121.0 (100 * 1.21), ya que el IVA general es del 21% desde 2012
        assertEquals(121.0, resultado, 0.01)
    }

    @Test
    fun calcularIVA_exentoAfter2012() {
        // Definimos el precio base del producto
        val precio = 200.0
        // Establecemos el tipo de IVA como "Exento" (sin IVA)
        val tipoIVA = "Exento"
        // Establecemos la fecha de compra como 20 de agosto de 2015 (después de la reforma de IVA de 2012)
        val fechaCompra = "20-08-2015"

        // Llamamos a la función calcularIVA para obtener el precio con IVA aplicado
        val resultado = calcularIVA(precio, tipoIVA, fechaCompra)

        // Comprobamos que el resultado sigue siendo 200.0, ya que el tipo de IVA "Exento" no aplica IVA
        assertEquals(200.0, resultado, 0.01)  // No se aplica IVA
    }

    @Test
    fun calcularIVA_reducidoBefore2010() {
        // Definimos el precio base del producto
        val precio = 50.0
        // Establecemos el tipo de IVA como "Reducido"
        val tipoIVA = "Reducido"
        // Establecemos la fecha de compra como 1 de enero de 2009 (antes de la reforma de IVA de 2010)
        val fechaCompra = "01-01-2009"

        // Llamamos a la función calcularIVA para obtener el precio con IVA aplicado
        val resultado = calcularIVA(precio, tipoIVA, fechaCompra)

        // Comprobamos que el resultado es 53.5 (50 * 1.07), ya que el IVA reducido era del 7% antes de 2010
        assertEquals(53.5, resultado, 0.01)
    }


}