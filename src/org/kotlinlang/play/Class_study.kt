package org.kotlinlang.play

fun main() {

    // 1. class
    // 2. data class

    // 1. 코딩
    // 2. 호출

    var cls = HelloClass() // 기본 생성자
    var cls1 = HelloClass(10) // 보조 생성자

    // java 호춯법
    // HelloClass cls = new HelloClass();

    println(cls.age)

    var person = Persion(21, "test")
    println(person)
    println(person.age)
    println(person.name)
}

class HelloClass{
    var age:Int = 0
    // 호출 될때 초기화 값을 넘길수 없음
//    init {
//
//    }

    // default 생성자, 보조 생성자 값을 넘길수 있으며 초기화함
    constructor() // 생성자
    constructor(age: Int){  // set
        this.age = age
    } // 보조생성자
}

data class Persion(var age:Int, val name:String)