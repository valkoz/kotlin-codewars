/**
 * https://www.codewars.com/kata/mumbling
 */
package kyu7

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals("A-Bb-Ccc-Dddd", accum("abcd"))
}

fun accum(s: String): String {
    var i = 0
    return s.asIterable()
            .fold("") { res, cur -> res + cur.toUpperCase() + cur.toString().repeat(i++).toLowerCase() + "-" }
            .dropLast(1)
}
