/**
 * https://www.codewars.com/kata/count-the-digit
 */
package kyu7

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(11, nbDig(25, 1))
}

fun nbDig(n: Int, d: Int) = generateSequence(0) { it + 1 }.map { it * it }.take(n + 1).toList().toString().count { it == "$d"[0] }
