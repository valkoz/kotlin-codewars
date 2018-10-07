/**
 * https://www.codewars.com/kata/55685cd7ad70877c23000102
 */
package kyu8

import kotlin.math.sign
import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(-1, makeNegative(1))
    assertEquals(-1, makeNegative(-1))
}

fun makeNegative(x: Int) = -x * x.sign