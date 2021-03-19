package org.kotlinlang.play

// 대부분의 다른 프로그래밍 언어(Java, C++등)와 마찬가지로
// Kotlin은 정의된 순서에 따라 메서드 및 생성자에게 인수를 전달하는 것을 지원합니다.
// Kotlin은 또한 명명된 인수를 지원하여 명확한 호출을 허용하고 인수 순서로 실수를 방지합니다.
// 이러한 실수는 컴파일러에서 감지되지 않기 때문에 찾기 가 어렵습니다(예: 두 개의 순차 인수가 동일한 형식이 있는 경우).
fun format(userName: String, domain: String) = "$userName@$domain"

fun main() {
    println(format("mario", "example.com"))        // 인수 값이 있는 함수를 호출합니다.
    println(format("domain.com", "username"))      // 전환된 인수로 함수를 호출합니다. 구문 오류는 없지만 결과 domain.com@username이 올바르지 않습니다.
    println(format(userName = "foo", domain = "bar.com"))           // 명명된 인수가 있는 함수를 호출합니다.
    println(format(domain = "frog.com", userName = "pepe"))         // 명명된 인수가 있는 함수를 호출할 때 원하는 순서대로 함수를 지정할 수 있습니다.
}