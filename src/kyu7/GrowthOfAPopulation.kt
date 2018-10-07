/**
 * https://www.codewars.com/kata/growth-of-a-population
 */
package kyu7

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(15, nbYear(1500, 5.0, 100, 5000))
}

fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int =
        generateSequence(pp0.toDouble()) { it * (1 + percent / 100) + aug }.takeWhile { it < p }.count()
