package org.kotlinlang.play

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String): Mammal(humanName)
class Car(val carName: String, val color: String, val carSize: String) : Mammal(carName)

fun greetMammal(mammal: Mammal): String{
    when(mammal){
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
        is Car -> return "${mammal.color} ${mammal.carSize} ${mammal.name}"
    }
}

fun main() {
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("lee jun su", "developer")))
    println(greetMammal(Car("porsche", "red", "medium")))
}