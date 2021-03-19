package org.kotlinlang.play

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

//Kotlin 컴파일러는 다음을 포함한 대부분의 경우 자동으로 타입 캐스트를 수행할 수 있을 정도로 똑똑하다.
//null 가능한 형식에서 null이 아닌 형식으로 캐스팅합니다.
//슈퍼타입에서 하위타입으로 캐스팅합니다.
fun main() {
    val date: ChronoLocalDate? = LocalDate.now()    // null 변수를 선언합니다.

    if (date != null) {
        println(date.isLeapYear)                    // 무효화할 수 없는 스마트 캐스트(isLeapYear에 직접 액세스할 수 있음).
    }

    if (date != null && date.isLeapYear) {          // 조건 내의 스마트 캐스트(Java와 같이 Kotlin은 단락을 사용하기 때문에 가능함)
        println("It's a leap year!")
    }

    if (date == null || !date.isLeapYear) {         // 조건 내에서 스마트 캐스트(단락으로도 활성화)
        println("There's no Feb 29 this year...")
    }

    if (date is LocalDate) {
        val month = date.monthValue                 // 하위 유형 로컬데이트에 스마트 캐스트.
        println(month)
    }
}