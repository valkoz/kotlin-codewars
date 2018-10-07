/**
 * https://www.codewars.com/kata/55a2d7ebe362935a210000b2
 */
package kyu8

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(2, findSmallestInt(listOf(34, 15, 88, 2)))
}

fun findSmallestInt(nums: List<Int>) = nums.min()