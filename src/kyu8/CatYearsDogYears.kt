/**
 * https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b
 */
package kyu8

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    val expected = arrayOf(3, 28, 29)
    assertEquals(true, calculateYears(3) contentEquals expected)
}

fun calculateYears(years: Int): Array<Int> =
        when (years) {
            1 -> arrayOf(years, 15, 15)
            2 -> arrayOf(years, 24, 24)
            else -> arrayOf(years, 24 + 4 * (years - 2), 24 + 5 * (years - 2))
        }