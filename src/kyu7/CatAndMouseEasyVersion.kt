/**
 * https://www.codewars.com/kata/cat-and-mouse-easy-version/kotlin
 */
package kyu7

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals("Escaped!", catMouse("C.....m"))
}

fun catMouse(s: String) = if (s.length > 5) "Escaped!" else "Caught!"
