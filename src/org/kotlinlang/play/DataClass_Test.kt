package org.kotlinlang.play

data class User(val name:String, val id : Int)

fun main() {
    val user = User("lee jun su", 1)
    println(user)

    val secondUser = User("lee jun su", 1 )
    val thirdUSer = User("lee eun jeong", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirUser: ${user == thirdUSer}")

    println(user.hashCode())
    println(secondUser.hashCode())

    // copy() function
    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 2))

    println("name = ${user.component1()}")
    println("id = ${user.component2()}")

}