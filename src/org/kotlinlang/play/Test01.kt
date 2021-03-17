package org.kotlinlang.play

import sun.rmi.runtime.Log

fun main() {
    println("방가방가");
    // cmd창에 데이터를 출력하는 명령
    println("하이하이");
    println(1 + 2);
    println(5 * 4.1)
    println("ABC")
    println('c')
//    println(1 + 2 + "ABC")
    println("ABC" + 1 + 2)
    println("ABC" + (1 + 2))
//    println(1 + 2 + "ABC" + 1 + 2)

    println('A')
    println("B \n C")
    //printf("%d", 10 )
    //print(Any(), 10 )


    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log");
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))


}


fun printMessage(message: String): Unit{
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int{
    return x + y
}
                                                                         
fun multiply(x : Int, y: Int) = x * y
