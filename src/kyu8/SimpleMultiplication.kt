/**
 * https://www.codewars.com/kata/583710ccaa6717322c000105
 */
package kyu8

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(16, simpleMultiplication(2))
    assertEquals(27, simpleMultiplication(3))
}

fun simpleMultiplication(n: Int) = if (n % 2 == 0) 8 * n else 9 * n
