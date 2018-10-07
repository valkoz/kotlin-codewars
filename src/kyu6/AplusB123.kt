/**
 * https://www.codewars.com/kata/a-plus-b-equals-equals-123
 */
package kyu6

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(122, int123(1))
}

fun int123(a: Int) = if (a > 123) 124 - a + Long.MAX_VALUE else 123L - a