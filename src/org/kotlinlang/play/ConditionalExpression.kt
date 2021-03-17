package org.kotlinlang.play

fun main() {

    fun max(a: Int, b: Int) = if(a > b) a else b

    println(max(99, -42))

    fun age(a : Int) = if(a >= 20) "성인" else "미성년"

    println(age(15))
    println(age(20))

}