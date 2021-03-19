package org.kotlinlang.play

fun main() {

    val A = listOf("a", "b", "c")                  // 문자 리스트 정의
    val B = listOf(1, 2, 3, 4)                     // 숫자 리스트 정의

    val resultPairs = A zip B                      // 문자, 숫자 리스트 병합 (각 인덱스 쌍으로 병합됨)
    val resultReduce = A.zip(B) { a, b -> "$a$b" } // 지정된 변환 형식으로 병합

    println("A to B: $resultPairs")
    println("\$A\$B: $resultReduce")
}