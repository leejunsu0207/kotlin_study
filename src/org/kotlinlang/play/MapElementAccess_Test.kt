package org.kotlinlang.play

fun main(args: Array<String>) {

    val map = mapOf("key" to 1)

    val value1 = map["key"]                             // key에 해당 value 42반환
    val value2 = map["key2"]                            // map에 없는 key 이기 떄문에 null반환

    val value3: Int = map.getValue("key")           // key에 해당 value 42반환

    val mapWithDefault = map.withDefault { k -> k.length }
    val value4 = mapWithDefault.getValue("key2")

    try {
        map.getValue("anotherKey")                  // map에 없기때문에 exception 던짐
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }


    println("value1 is $value1")    // key에 해당 value 42반환
    println("value2 is $value2")    // map에 없는 key 이기 떄문에 value null반환
    println("value3 is $value3")    // key에 해당 value 42반환
    println("value4 is $value4")    // map에 없는 key 여서 기본값 4반환
}