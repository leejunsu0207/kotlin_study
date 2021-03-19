package org.kotlinlang.play

fun customPrint(s: String) {
    print(s.toUpperCase())
}
// Kotlin 표준 라이브러리 함수는 범위 지정 및 Null 검사에 사용할 수 있습니다. 개체에서 호출되면 지정된 코드 블록을 실행하고 마지막 식의 결과를 반환합니다. 객체를 기준으로 블록 내부에서 액세스할 수 있습니다.
fun main() {
    val empty = "test".let {               // 문자열 "test"의 결과에서 지정된 블록을 호출합니다.
        customPrint(it)                    // it 참조로 "test"의 함수를 호출합니다.
        it.isEmpty()                       // 이 식의 값을 반환합니다.
    }
    println(" is empty: $empty")        // 이거 잘모르겠다 나중에 확인해보자


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {                         // safe call을 사용하므로 let과 해당 코드 블록은 null이 아닌 값에서만 실행됩니다.
            print("\t")
            customPrint(it)
            println()
        }
    }
    printNonNull(null)
    printNonNull("my string")
}