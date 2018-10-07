/**
 * https://www.codewars.com/kata/57f780909f7e8e3183000078
 */
package kyu8

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(24, grow(intArrayOf(1, 2, 3, 4)))
}

fun grow(arr: IntArray) = arr.fold(1) { acc, cur -> acc * cur }