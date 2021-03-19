package org.kotlinlang.play

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    println(numbers.filter { x -> x > 0 })
    println(numbers.filter { it < 0 })
}