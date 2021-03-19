package org.kotlinlang.play

data class User_1(val username: String, val email: String)    // 데이터 클래스를 정의합니다.

fun getUser() = User_1("Mary", "mary@somewhere.com")

// 어렵다 나중에 또 보자!
fun main() {
    val user = getUser()
    val (username, email) = user                            // 인스턴스를 손상시킵니다. 선언된 값은 인스턴스 필드에 매핑됩니다.
    println(username == user.component1())                  // 데이터 클래스는 분담 중에 호출될 component1() 및 component2() 메서드를 자동으로 정의합니다

    val (_, emailAddress) = getUser()                       // 값 중 하나가 필요하지 않은 경우 밑줄을 사용하여 사용되지 않은 변수를 나타내는 컴파일러 힌트를 피하십시오.

}