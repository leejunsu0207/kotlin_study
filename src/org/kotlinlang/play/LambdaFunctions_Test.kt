package org.kotlinlang.play

fun main() {
    // 모든 예제는 대소문자를 수행하는 함수 개체를 만듭니다.
    // 문자열에서 문자열로

    val upperCase1 : (String) -> String = {str : String -> str.toUpperCase()}

    val upperCase2 : (String) -> String = {str -> str.toUpperCase()}

    val upperCase3 = {str : String -> str.toUpperCase()}

    // val upperCase4 = {str -> str.toUpperCase()}  // 둘다 함께 할수 없다.

    val upperCase5 : (String) -> String = {it.toUpperCase()}

    val upperCase6 : (String) -> String = String::toUpperCase

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))

}