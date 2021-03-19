package org.kotlinlang.play

val systemUsers: MutableList<Int> = mutableListOf(1,2,3)    // 수정가능한 배열 선언
val sudoers: List<Int> = systemUsers                        // 읽기 전용으로 선언

fun addSudoer(newUser : Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers():List<Int>{
    return sudoers
}

fun main() {
    addSudoer(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
            i -> println("Some useful info on user $i")
    }
}