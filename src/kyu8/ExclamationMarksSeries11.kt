/**
 * https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed
 */
package kyu8

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals("!!!!!", replace("aeiou"))
}

fun replace(s: String) = s.replace(Regex("""[aeiou]""", RegexOption.IGNORE_CASE), "!")
