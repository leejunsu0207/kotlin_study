package org.kotlinlang.play

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // Any
    // 배열의 원소 중에 하나 이상 지정된 조건에 일치하면 true함수 반환
    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 6 }
    println("Numbers: $numbers")
    println("Is there any number less than 0: $anyNegative")
    println("Is there any number greater than 6: $anyGT6")

    // All
    // 배열의 모든 원소가 지정된 조건에 일치하는 경우 true함수 반환
    val allEven = numbers.all { it % 2 == 0 }
    val allLess6 = numbers.all { it < 6 }
    println("Numbers: $numbers")
    println("All numbers are even: $allEven")
    println("All numbers are less than 6: $allLess6")

    // none
    // 배열의 원소중이 지정된 조건에 일치 하지 않는 경우 true함수 반환
    val allEven_ = numbers.none { it % 2 == 1 }
    val allLess6_ = numbers.none { it > 6 }
    println("Numbers: $numbers")
    println("All numbers are even: $allEven_")
    println("No element greater than 6: $allLess6_")
}