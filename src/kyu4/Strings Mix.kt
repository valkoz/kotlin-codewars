package kyu4

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    val s1 = "my&friend&Paul has heavy hats! &"
    val s2 = "my friend John has many many friends &"
    assertEquals(mix(s1, s2), "2:nnnnn/1:aaaa/1:hhh/2:mmm/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss")
}

fun mix(s1: String, s2: String): String {

    val l1 = s1.extractLetters("1")
    val l2 = s2.extractLetters("2")
    return (l1 + l2)
            .asSequence()
            .sortedByDescending { it.second }
            .groupBy { Pair(it.first[2], it.second) }
            .map { it.key to if (it.value.size == 2) "=" else it.value[0].first[0] }
            .distinctBy { it.first.first }
            .map { it.second to it.first.first.toString().repeat(it.first.second) }
            .map { "${it.first}:${it.second}" }
            .sortedWith(compareByDescending<String> { it.length }.thenBy { it.first() }.thenBy { it.last() })
            .joinToString("/")
}

fun String.extractLetters(startWith: String) =
        this.filter { it in 'a'..'z' }
                .map { "$startWith:$it" to this.count { c -> c == it } }
                .asSequence()
                .filter { it.second > 1 }
                .distinct()
                .toList()