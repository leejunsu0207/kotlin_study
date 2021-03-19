package org.kotlinlang.play

fun main() {
    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 42 })    // 인덱스1 의 요소 출력
    println(list.getOrElse(10) { 42 })   // 인덱스의 범위를 벗어나 기본값{42} 출력
    println(list.getOrElse(0) { 42 })    // 인덱스0 의 요소 출력


    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x") { 1 })       // 맵에 "x"키가 없기 때문에 기본값{1} 출력

    map["x"] = 3
    println(map.getOrElse("x") { 1 })       // 맵에 "x"키에 숫자3 정의 되어 있기 때문에 value=3 출력

    map["x"] = null
    println(map.getOrElse("x") { 1 })       // 맵 "x"키값이 정의되지 않았기 때문에 기본값{1} 출력
}