package org.kotlinlang.play

fun main() {

    for(i in 0..3){ // java에서 for(int i = 0; i <= 3; i++) 과 같음
        print(i)    // 0~3까지 출력
    }
    print(" ")

    for(i in 0 until 3) {   // java에서 for(int i = 0; i < 3; i++) 과 같음
        print(i)            // 0~2까지 출력
    }
    print(" ")

    for(i in 2..8 step 2) { // 2~8 출력하고 2씩 증가하며 출력 java에서 for(int i = 2; i <= 8; i+=2) 과 같음
        print(i)            // 2468
    }
    print(" ")

    for (i in 3 downTo 0) { // 3~0으로 역순 출력함
        print(i)            // 3210
    }
    print(" ")

    // char 범위 지원
    for(c in 'a'..'d'){ // a~d까지 전부 출력
        print(c)
    }
    print(" ")

    for(c in 'z' downTo 's' step 2){    // s~z역순으로 2씩 증가하며 출력
        print(c)
    }
    print(" ")
    println()
    // ranges(범위)는 if문에서도 유용함
    val x = 2
    if(x in 1..5){ // x가 1~5안에 포함되어있는가
        print("x is in range from 1 to 5")
    }
    println()

    if(x !in 6..10){ // x가 6~10에 포함되어 있지 않은가
        print("x is not in range from 6 to 10")
    }



}