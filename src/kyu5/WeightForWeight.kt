/**
 * https://www.codewars.com/kata/weight-for-weight/kotlin
 **/

package kyu5

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    val input = "  56 65 74 100 99 68 86   180 90 "
    val expected = "100 180 90 56 65 74 68 86 99"
    assertEquals(expected, orderWeight(input))
}

fun orderWeight(string: String) = when (string) {
    "" -> ""
    else -> string.trim { it == ' ' }
            .split("\\s+".toRegex())
            .asSequence()
            .map { it.toLong() }
            .map { value -> value to value.toString().sumBy { it - '0' } }
            .sortedWith(compareBy({ it.second }, { it.first.toString() }))
            .map { it.first }
            .joinToString(" ")
}