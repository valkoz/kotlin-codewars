/**
 * https://www.codewars.com/kata/get-the-middle-character
 */
package kyu7

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals("es", getMiddle("test"))
}

fun getMiddle(word: String) = word.substring(word.length / 2 + word.length % 2 - 1, word.length / 2 + 1)
