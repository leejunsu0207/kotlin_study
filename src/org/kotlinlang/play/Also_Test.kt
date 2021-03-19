package org.kotlinlang.play

data class Person_1(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person_1) {
    println("A new person ${p.name} was created.")
}

// 또한 apply와 같이 작동합니다. 지정된 블록을 실행하고 호출된 개체를 반환합니다. 블록 내부에서는 개체가 해당 개체를 참조하므로 인수로 전달하기가 더 쉽습니다. 이 기능은 콜체인에 로그인하는 것과 같은 추가 작업을 포함시키는 데 유용합니다.
fun main() {
    val jake = Person_1("Jake", 30, "Android developer")   // 사용자 개체 생성
        .also {                                          // 지정된 코드블록을 개체에 적용 반환값은 개체 자체
            writeCreationLog(it)                         // 개체를 통과하는 로깅 함수를 인수로 호출합니다.
        }
}