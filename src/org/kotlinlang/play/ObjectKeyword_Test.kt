package org.kotlinlang.play

import java.util.*

class LuckDispatcher{
    fun getNumber(){
        val objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  // 객체 표현식

    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    print("Total price: $$total")

}

object DoAuth { // 객체 선언
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

class BigBen {  // 지원 객체
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()

    rentPrice(10, 2,1)
    println()
    DoAuth.takeParams("foo","qwerty")

    BigBen.getBongs(12)
}