package org.kotlinlang.play

fun main() {
    // 1. 배열
    // 2. loop반복
    // 3. 캐스팅

    // 1. 배열 = {"","",""}
    var arr0 = listOf("1","2")              // java 에서 ArrayList 같으나 수정은 불가능 하다
    var arr1 = mutableListOf("1","2")       // java 에서 ArrayList 같으나 수정 가능
    println(arr0)
    // arr0.add //불가능
    arr1.add("3")

    // 2. 반복문 (java에서 썻던 향상된 반복문 사용)
    for (item in arr1 ){ // 기본 for문
        println(item)
    }

    for ((index, item) in arr1.withIndex() ){ // 배열의 인덱스까지 보여줌
        println("$item => $index")
    }

    // 3. casting object => java기준으로 String, int, long 전부 담울스 있는 객체 kotlin 에선 Any로 씀
    var temp: Any = "hello"
    if (temp is String){
        var str: String = temp; // 바로 스트링 객체에 담음
        // 자바에선 String str = (String) temp;
        // 캐스팅 해줘야 하지만 코틀린에선 조건문에 맞아서 조건문 안에
        // 들어오는 경우 auto casting 기능으로 캐스팅 되어있음
    }




}