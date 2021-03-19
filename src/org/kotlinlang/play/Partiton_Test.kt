package org.kotlinlang.play

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)                 // 리스트 숫자 정의

    val evenOdd = numbers.partition { it % 2 == 0 }           // 짝수 홀수 분할
    val (positives, negatives) = numbers.partition { it > 0 } // 얌수 음수 분할

    println("Numbers: $numbers")                                // 숫자 리스트 전체 출력
    println("Even numbers: ${evenOdd.first}")                   // 짝수 출력
    println("Odd numbers: ${evenOdd.second}")                   // 홀수 출력
    println("Positive numbers: $positives")                     // 양수 출력
    println("Negative numbers: $negatives")                     // 음수 출력
}