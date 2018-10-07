/**
 * https://www.codewars.com/kata/html-dynamic-color-string-generation/
 */
package kyu6

import java.util.*
import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals("#", generateColor(Random()).substring(0, 1))
}

fun generateColor(r: Random): String {
    val charPool = "01234567890abcdef"
    var result = "#"
    repeat(6) {
        result += charPool[r.nextInt(charPool.length)]
    }
    return result
}