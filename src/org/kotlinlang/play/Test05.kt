package org.kotlinlang.play

open class Dog{
    open fun sayHello(){
        println("wow wow!")
    }
}

class Yorkshire : Dog(){
    override fun sayHello() {
        println("wif wif!")
    }
}

class franch : Dog(){

}

class jindo : Dog(){
    override fun sayHello() {
        println("wang wang!")
    }
}

open class Tiger(val origin: String){
    fun sayHello(){
        println("A tiger from $origin says: grrhhh!")
    }
}

class  SiberianTiger : Tiger("Siberia")


open class Lion(val name: String, val origin: String){
    fun sayHello(){
        println("$name, the lion form $origin say: graoh!")
    }
}

class Asiatic(name: String):Lion(name=name, origin = "India")


fun main() {
    val dog1 = Dog()
    dog1.sayHello()

    var dog: Dog = Yorkshire()
    dog.sayHello()

    dog = franch()
    dog.sayHello()

    dog = jindo()
    dog.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}