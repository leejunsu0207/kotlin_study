package org.kotlinlang.play

import kotlin.reflect.KProperty

// Kotlin은 속성 집합의 호출을 위임하고 메소드를 특정 객체에 가져올 수 있는 위임된 속성의 메커니즘을 제공한다. 이 경우 대리자 개체에는 getValue 메서드가 있어야 합니다. 변경 가능한 속성의 경우 setValue도 필요합니다.
class Example {
    var p: String by Delegate()                                               // 문자열 유형의 속성 p를 클래스 위임의 인스턴스로 위임합니다. 위임 개체는 키워드별 뒤에 정의됩니다.

    override fun toString() = "Example Class"
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {        // 위임 방법. 이러한 방법의 서명은 항상 예와 같습니다. 구현에는 필요한 모든 단계가 포함될 수 있습니다. 불변 속성의 경우 getValue만 필요합니다.
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) { // 위임 방법. 이러한 방법의 서명은 항상 예와 같습니다. 구현에는 필요한 모든 단계가 포함될 수 있습니다. 불변 속성의 경우 getValue만 필요합니다.
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

// Kotlin 표준 라이브러리에는 Lazy, 관찰할 수 있는 등의 유용한 딜러가 다수 포함되어 있습니다. 당신은 그것들을 있는 그대로 사용해도 됩니다. 예를 들어, Lazy는 Lazy 초기화에 사용된다.
class LazySample {
    init {
        println("created!")            // 속성 lazy는 개체 생성시 초기화되지 않습니다.
    }

    val lazyStr: String by lazy {
        println("computed!")          // get()하기 위한 첫 번째 호출은 lazy()로 전달된 람다 식을 인수로 실행하고 결과를 저장합니다.
        "my lazy"
    }
}

// 속성 위임을 사용하여 맵에 속성을 저장할 수 있습니다. 이 기능은 JSON을 구문 분석하거나 다른 "동적" 작업을 수행하는 데 유용합니다.
class User_(val map: Map<String, Any?>) {
    val name: String by map                // 대리자는 문자열 키 - 속성의 이름으로맵에서 값을 사용합니다.
    val age: Int     by map                // 대리자는 문자열 키 - 속성의 이름으로맵에서 값을 사용합니다.
}

fun main() {
    val e = Example()
    println(e.p)
    e.p = "NEW"
    e.p = "HI !!!!!"

    val sample = LazySample()         // 속성 lazy는 개체 생성시 초기화되지 않습니다.
    println("lazyStr = ${sample.lazyStr}")  // get()하기 위한 첫 번째 호출은 lazy()로 전달된 람다 식을 인수로 실행하고 결과를 저장합니다.
    println(" = ${sample.lazyStr}")  // 저장된 결과를 반환하기 위해 추가 호출() 반환합니다.
                                     // 스레드 안전을 원한다면 blockingLazy()를 대신 사용합니다: 값이 한 스레드에서만 계산되고 모든 스레드가 동일한 값을 볼 수 있도록 보장합니다.
                        // 이거 조금 헷갈림 다시 봐야됨



    val user = User_(mapOf(
        "name" to "John Doe",
        "age"  to 25
    ))

    println("name = ${user.name}, age = ${user.age}")
}