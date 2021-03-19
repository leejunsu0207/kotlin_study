package org.kotlinlang.play

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // map 확장 기능을 사용하면 리스트의 모든 원소에 변환을 적용할수 있다.
    println(numbers.map { x -> x * 2 }) // numbers 각 원소에 * 2한다.
    println(numbers.map { it * 3 })     // numbers 각 원소에 * 3한다.
}
