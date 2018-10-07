/**
 * https://www.codewars.com/kata/5aff237c578a14752d0035ae
 */
package kyu7

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(86, predictAge(65, 60, 75, 55, 60, 63, 64, 45))
}

fun predictAge(vararg age: Int) = (Math.sqrt((age.map { it * it }.sum().toDouble())) / 2).toInt()
