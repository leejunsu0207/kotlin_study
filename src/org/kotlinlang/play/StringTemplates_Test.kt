package org.kotlinlang.play

// 문자열 템플릿을 사용하면 문자열에 변수 참조 및 식을 포함할 수 있습니다. 문자열 값(예: println)이 요청되면 모든 참조와 식이 실제 값으로 대체됩니다.
fun main() {
    val greeting = "Kotliner"

    println("Hello $greeting")                  // 변수 참조가 있는 문자열을 인쇄합니다. 문자열 참조는 $로 시작합니다.
    println("Hello ${greeting.toUpperCase()}")  // 식이 있는 문자열을 인쇄합니다. 표현은 $로 시작하고 곱슬곱슬한 교정기로 둘러싸여 있습니다.
    println("plus ${1 + 1}")
    println("plus " + 1 + 1)
    println("plus " + (1 + 1))
}