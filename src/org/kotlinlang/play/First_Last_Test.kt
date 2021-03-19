package org.kotlinlang.play

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()                          // 배열의 첫번째 원소
    val last = numbers.last()                            // 배열의 마지막 원소

    val firstEven = numbers.first { it % 2 == 0 }        // 배열의 원소중 짝수이 며 첫번째 원소
    val lastOdd = numbers.last { it % 2 != 0 }           // 배열의 원소중 홀수이 며 마지막 원소

    println("Numbers: $numbers")
    println("First $first, last $last, first even $firstEven, last odd $lastOdd")

    // ---------------------------------------------------------------------------------------------

    val words = listOf("foo", "bar", "baz", "faz")         // 단어 배열 선언(수정안됨)
    val empty = emptyList<String>()                        // 빈 배열 선언(수정안됨)

    val first_ = empty.firstOrNull()                        // 빈 배열의 첫번째 원소 선택
    val last_ = empty.lastOrNull()                          // 빈 배열의 마지막 원소 선택

    val firstF = words.firstOrNull { it.startsWith('f') }  // 단어 배열 의 원소중 'f'로 시작 하는 첫번째 원소
    val firstZ = words.firstOrNull { it.startsWith('z') }  // 단어 배열 의 원소중 'z'로 시작 하는 첫번째 원소
    val lastF = words.lastOrNull { it.endsWith('f') }      // 단어 배열 의 원소중 'f'로 끝나는 마지막 원소
    val lastZ = words.lastOrNull { it.endsWith('z') }      // 단어 배열 의 원소중 'z'로 끝나는 마지막 원소

    println("First $first_, last $last_")
    println("First starts with 'f' is $firstF, last starts with 'z' is $firstZ")
    println("First ends with 'f' is $lastF, last ends with 'z' is $lastZ")
}

