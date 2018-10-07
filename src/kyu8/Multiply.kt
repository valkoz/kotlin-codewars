/**
 * https://www.codewars.com/kata/50654ddff44f800200000004
 */
package kyu8

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(6.0, multiply(2.0, 3.0))
}

fun multiply(x: Double, y: Double) = x * y