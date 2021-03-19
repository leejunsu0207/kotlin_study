package org.kotlinlang.play

import kotlin.math.abs

fun main() {

    val shuffled = listOf(5, 4, 2, 1, 3, -10, 6, -3, 11)                   // 정렬되지 않은 숫자리스트 정의
    val natural = shuffled.sorted()                             // 오름차순정렬
    val inverted = shuffled.sortedBy { -it }                    // 내림차순정렬
    val descending = shuffled.sortedDescending()                // 정렬된 내림차순을 사용하여 반전된 내림차순으로 정렬합니다.
    val descendingBy = shuffled.sortedByDescending { abs(it)  } // abs(it)를 선택 함수로 사용하여 항목의 절대값의 반전된 자연 순서로 정렬합니다.. 음수,정수 상관없는 절대값으로 내림차순 정렬

    println("Shuffled: $shuffled")
    println("Natural order: $natural")
    println("Inverted natural order: $inverted")
    println("Inverted natural order value: $descending")
    println("Inverted natural order of absolute values: $descendingBy")
}
