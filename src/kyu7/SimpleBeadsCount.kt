/**
 * https://www.codewars.com/kata/simple-beads-count
 */
package kyu7

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(6, countRedBeads(4))
}

fun countRedBeads(nBlue: Int) = if (nBlue != 0) 2 * (nBlue - 1) else 0
