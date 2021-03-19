package org.kotlinlang.play

fun main() {
    val numbers = listOf(1, 2, 3)   // 숫자 리스트 정의

    val tripled = numbers.flatMap { listOf(it, it, it) } // 숫자리스트의 요소가 3번 반복 개체 변환 리스트 정의 한다.
                                                         // 중요한것은 리스트가 아니라 9개의 요소를 가진 정소들의 리스트라는 것이다?
                                                         // 뭔소린지 모르겠음....ㅎㅎ

    println("Numbers: $numbers")
    println("Transformed: $tripled")
}