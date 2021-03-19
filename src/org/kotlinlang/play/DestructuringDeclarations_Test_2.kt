package org.kotlinlang.play

class Pair_<K, V>(val first: K, val second: V) {  // 구성 component1() 및 component2() 메서드를 가진 사용자 지정 쌍 클래스를 정의합니다.
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}

// 어렵다 나중에 또 보자!
fun main() {
    val (num, name) = Pair_(1, "one")             // 이 클래스의 인스턴스를 기본 제공 쌍과 동일한 방식으로 구조 조정합니다.

    println("num = $num, name = $name")

    val (num1, name1) = Pair_(2, "two")

    println("num1 = $num1, name1 = $name1")

}