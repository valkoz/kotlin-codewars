/**
 * https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097
 */
package kyu8

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(18, century(1705))
}

fun century(number: Int) = (number - 1) / 100 + 1