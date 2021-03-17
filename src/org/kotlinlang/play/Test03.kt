package org.kotlinlang.play

fun main() {
    var a: String = "initial"
    println(a)
    val b: Int = 1
    val c = 3

    var e: Int
    // println(e) // Kotlin: Variable 'e' must be initialized

    val d : Int
    if(someContiton()){
        d = 1
    } else {
        d = 2
    }

    println(d)

    var neverNull: String = "This can't be null"
    // neverNull = null // null 불가

    var nullable: String? = "You can keep a null here"
    nullable = null // null 가능

    var inferredNonNull = "The compiler assumes non-null"
    // inferredNonNull = null // 타입 선언 안한 변수(추론된)에 null 할당 시 에러

    fun strLength(notNull: String):Int {
        return notNull.length
    }

    println(strLength(neverNull))
    //println(strLength(nullable)) // 함수 파라미터 null일때 에러


    fun describeString(maybeString : String?): String{
        if (maybeString != null && maybeString.length > 0 ){
            return "String of length ${maybeString.length}"
        }else{
            return "Empty or null string"
        }
    }

    println(describeString(null))
    println(describeString("test"))




}

fun someContiton() = true

