package controllers.Exe2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class Exe2KtTest {

 @Test
  fun `roman_convierte_números_pequeños`() {
   assertEquals("I", roman(1))
   assertEquals("IV", roman(4))
   assertEquals("IX", roman(9))
  }

  @Test
  fun `roman_convierte_números_medianos`() {
   assertEquals("XL", roman(40))
   assertEquals("XC", roman(90))
   assertEquals("CD", roman(400))
  }

  @Test
  fun `roman_convierte_números_grandes`() {
   assertEquals("M", roman(1000))
   assertEquals("MMXXIV", roman(2024))
   assertEquals("MMMCMXCIX", roman(3999))
  }
 }
/**
 * No puedo probar directamente funciones que usan `Scanner` porque dependen de `System.in`,
 * lo que requiere entrada en tiempo real desde el teclado. Esto no es controlable en pruebas automatizadas.
 *
 * @authorViktoriia
 */