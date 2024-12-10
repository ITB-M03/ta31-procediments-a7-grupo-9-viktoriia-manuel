package controllers.A7_EJ4

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class EJ4KtTest {

@Test
 fun titol() {

 }

  /* A diferencia de las funciones, los procedimiento no devuelven nada y al no devolver
   * no es posible hacer tests de prueba
   *
   */

  @Test
  fun calcularEspaciosLaterales() {
   val texto = "Hola"
   val anchoPantalla = 80
   val resultado = calcularEspaciosLaterales(texto, anchoPantalla)
   val esperado = 38  // el tamaño del texto en este caso sería 4, el resultado esperado es 38 (80-4)/2
   assertEquals(esperado, resultado)
  }

  @Test
  fun calcularEspaciosLaterales2() {
   val texto = "Hoy hace mucho frío, la Navidad está llegando y se nota la bajada de temperatura."
   val anchoPantalla = 80
   val resultado = calcularEspaciosLaterales(texto, anchoPantalla)
   val esperado = 0  // al ser el texto de 80 carácteres, no se necesitan espacios, por lo que el resultado esperado es 0.
   assertEquals(esperado, resultado)
  }

  @Test
  fun calcularEspaciosLaterales3() {
   val texto = ""
   val anchoPantalla = 80
   val resultado = calcularEspaciosLaterales(texto, anchoPantalla)
   val esperado = 40  // un texto vacío no restaría nada porque no hay carácteres, por lo que dividiría el ancho de la pantalla entre 2.
   assertEquals(esperado, resultado)
  }

  @Test
  fun calcularEspaciosLaterales4() {
   val texto = "Esto es una prueba para comprobar esta frase."
   val anchoPantalla = 80
   val resultado = calcularEspaciosLaterales(texto, anchoPantalla)
   val esperado = 17 // esta frase tiene 46 carácteres, por lo que el resultado esperado es 17.
   assertEquals(esperado, resultado)
  }

 }