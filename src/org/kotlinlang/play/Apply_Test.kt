package org.kotlinlang.play

data class Person_(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

// apply는 개체에 대한 코드 블록을 실행하고 개체 자체를 반환합니다. 블록 내에서 개체는 이에 의해 참조됩니다. 이 기능은 개체를 초기화하는 데 유용합니다.
fun main() {
    val jake = Person_()                                     // 인스턴스 생성

    val stringDescription = jake.apply {                    // 코드 블록(다음 3줄)을 인스턴스에 적용합니다.
        name = "Jake"                                       // 내부는 jake.name = "Jake" 와 동일한 구조
        age = 30
        about = "Android developer"
    }.toString()                                            // 반환 값은 인스턴스 자체이므로 다른 작업을 체인으로 연결할 수 있습니다.
    println(stringDescription)
}