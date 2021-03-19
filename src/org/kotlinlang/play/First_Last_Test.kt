package org.kotlinlang.play

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()                          // 배열의 첫번째 원소
    val last = numbers.last()                            // 배열의 마지막 원소

    val firstEven = numbers.first { it % 2 == 0 }        // 배열의 원소중 짝수이 며 첫번째 원소
    val lastOdd = numbers.last { it % 2 != 0 }           // 배열의 원소중 홀수이 며 마지막 원소

    println("Numbers: $numbers")
    println("First $first, last $last, first even $firstEven, last odd $lastOdd")
}