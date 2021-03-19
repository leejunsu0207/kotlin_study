package org.kotlinlang.play

class Configuration(var host: String, var port: Int)

fun main() {

    val configuration = Configuration(host = "127.0.0.1", port = 9000)
    // with는 인수 멤버에 간결하게 액세스할 수 있는 비삭제 함수입니다. 멤버를 참조할 때 인스턴스 이름을 생략할 수 있습니다.
    with(configuration) {
        println("$host:$port")
    }
    // instead of:
    println("${configuration.host}:${configuration.port}")
}