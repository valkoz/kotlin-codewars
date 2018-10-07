/**
 * https://www.codewars.com/kata/5541f58a944b85ce6d00006a
 */

package kyu5

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    val input = 714L
    val expected = longArrayOf(21, 34, 1)
    val result = productFib(input)
    for (it in expected.indices)
        assertEquals(expected[it], result[it])
}

fun productFib(prod: Long): LongArray {

    val fib: Sequence<Long> = generateSequence(1L to 1L) { it.second to it.first + it.second }.map { it.first }

    val mul = fib.zipWithNext { a, b -> a * b }.takeWhile { it <= prod }.toList().size

    val first: Long = fib.take(mul).last()
    val second: Long = fib.take(mul + 1).last()
    val third: Long = fib.take(mul + 2).last()
    val isEquals = first * second == prod

    return if (isEquals) longArrayOf(first, second, 1) else longArrayOf(second, third, 0)
}
