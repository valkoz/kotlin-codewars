/**
 * https://www.codewars.com/kata/maximum-length-difference
 */
package kyu7

import kotlin.math.abs
import kotlin.math.max
import kotlin.test.assertEquals

fun main(args: Array<String>) {
    val s1 = arrayOf("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
    val s2 = arrayOf("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
    assertEquals(13, mxdiflg(s1, s2))
}

fun mxdiflg(a1: Array<String>, a2: Array<String>) =
        if (a1.isNotEmpty() && a2.isNotEmpty()) {
            max(abs(a1.maxBy { it.length }?.length!! - a2.minBy { it.length }?.length!!),
                    abs(a2.maxBy { it.length }?.length!! - a1.minBy { it.length }?.length!!))
        } else -1
