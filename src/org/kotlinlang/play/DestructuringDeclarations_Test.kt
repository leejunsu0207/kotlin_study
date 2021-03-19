package org.kotlinlang.play

fun findMinMax(list: List<Int>): Pair<Int, Int> {
    // do the math
    return Pair(50, 100)
}

// 어렵다 나중에 또 보자!
fun main() {
    val (x, y, z) = arrayOf(5, 10, 15)                              // 배열을 해체합니다. 왼쪽의 변수 개수는 오른쪽의 변수 개수와 일치합니다.

    val map = mapOf("Alice" to 21, "Bob" to 25, "jun" to 50)
    for ((name, age) in map) {                                      // map도 구조화될 수 있습니다. 이름과 연령 변수는 맵 키 및 값에 매핑됩니다.
        println("$name is $age years old")
    }

    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))    // 내장된 쌍 및 트리플 유형은 함수의 반환 값으로도 중단도 지원합니다.

}