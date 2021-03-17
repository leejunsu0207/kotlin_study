package org.kotlinlang.play

fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)     // 순서 무시 하며 true
    println(authors === writers)    // 고유한 참조 이기 때문 false

    val num1 = setOf(1,2,3)
    val num2 = setOf(3,1,2)

    println(num1 == num2)
    println(num1 === num2)

}