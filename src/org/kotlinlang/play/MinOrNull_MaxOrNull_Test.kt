package org.kotlinlang.play

fun main() {

    val numbers = listOf(1, 2, 3)   // 숫자 리스트 정의
    val empty = emptyList<Int>()    // 빈 리스트 정의
    val only = listOf(3)            // 유일 리스트 정의

    println("Numbers: $numbers, min = ${numbers.minOrNull()} max = ${numbers.maxOrNull()}") // 숫자리스트중 min,max값 출력
    println("Empty: $empty, min = ${empty.minOrNull()}, max = ${empty.maxOrNull()}")        // 빈리스트중 min,max값 출력
    println("Only: $only, min = ${only.minOrNull()}, max = ${only.maxOrNull()}")            // 유일리스트중 min,max값 출력
}