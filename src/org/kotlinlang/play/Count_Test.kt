package org.kotlinlang.play

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)         // 배열 선언

    val totalCount = numbers.count()                     // 배열의 원소 갯수 ( 배열 길이)
    val evenCount = numbers.count { it % 2 == 0 }        // 배열의 원소 중 짝수의 갯수

    println("Total number of elements: $totalCount")
    println("Number of even elements: $evenCount")
}