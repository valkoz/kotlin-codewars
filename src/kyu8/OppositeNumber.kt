/**
 * https://www.codewars.com/kata/56dec885c54a926dcd001095
 */
package kyu8

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(-1, opposite(1))
}

fun opposite(number: Int) = -number