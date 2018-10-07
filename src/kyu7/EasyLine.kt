/**
 * https://www.codewars.com/kata/easy-line
 */
package kyu7

import java.math.BigInteger
import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(BigInteger.valueOf(70), easyLine(4))
}

fun easyLine(n: Int): BigInteger {

    fun factorial(num: Int): BigInteger =
            generateSequence(1.toBigInteger()) { it.inc() }.take(num).fold(1.toBigInteger()) { v1, v2 -> v1 * v2 }

    fun binomial(n: Int, k: Int): BigInteger =
            (n - k + 1..n).fold(1.toBigInteger()) { acc, i -> acc * i.toBigInteger() } / factorial(k)

    return (0..n).map { binomial(n, it) * binomial(n, it) }.reduce { a, b -> a + b }
}
