package org.kotlinlang.play

fun main() {
    infix fun Int.times1(str : String) = str.repeat(this)
    println(4 times1 "Bye")

    val pair = "Ferrari" to "Ketrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "Mclaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("claudia")
    sophia likes claudia

    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])


    printAll( "안녕", "Hello", "Hallo", "Salut", "Hola")
    printAllWithPrefix("안녕","Hello", "Hallo", "Salut", "Hola", prefix = "Greeting")
    log("안녕", "Hello", "Hallo", "Salut", "Hola")

}

fun printAll(vararg messages: String){
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages:String, prefix:String) {
    for (m in messages) println(prefix + m)
}

fun log(vararg entries: String){
    printAll(*entries)
}

class Person(val name: String){
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person){
        likedPeople.add(other)
    }
}

