package org.kotlinlang.play

fun main() {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {                                                  // null 변수에서 지정된 블록을 호출합니다.
            println("\tis empty? " + isEmpty())                    // 실행 중에 개체 구성원은 이름 없이 액세스할 수 있습니다.
            println("\tlength = $length")
            length                                                 // run은 Null이 아닌 경우 지정된 문자열의 길이를 반환합니다.
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}