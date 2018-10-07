/**
 * https://www.codewars.com/kata/encrypt-this
 */
package kyu6

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals("104olle 119drlo", encryptThis("hello world"))
}

fun encryptThis(text: String) = text.split(" ").joinToString(" ") {
    it.first().toByte().toString() +
            when {
                it.length == 2 -> it[1]
                it.length > 2 -> it.last() + it.substring(2).dropLast(1) + it[1]
                else -> ""
            }
}
