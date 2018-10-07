/**
 * https://www.codewars.com/kata/opposites-attract/kotlin
 */
package kyu8

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(true, loveFun(1, 2))
    assertEquals(false, loveFun(2, 2))
}

fun loveFun(flowerA: Int, flowerB: Int) = ((flowerA + flowerB) % 2 != 0)


