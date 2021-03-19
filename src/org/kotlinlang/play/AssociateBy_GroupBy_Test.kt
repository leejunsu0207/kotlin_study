package org.kotlinlang.play

fun main() {

    data class Person(val name: String, val city: String, val phone: String) // data class 정의

    val people = listOf(                                                     // 리스트 사람 정의
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
    )

    val phoneBook = people.associateBy { it.phone }                          // phone를 키로 Person클래스의 데이터 전부 묶어 출력
    val cityBook = people.associateBy(Person::phone, Person::city)           // Person클래스의 phone, city만 묶어 출력
    val peopleCities = people.groupBy(Person::city, Person::name)            // Person클래스의 city를 키로 name를 묶어 출력
    val lastPersonCity = people.associateBy(Person::city, Person::name)      // Person클래스의 city, name만 묶어 출력


    println("People: $people")
    println("Phone book: $phoneBook")
    println("City book: $cityBook")
    println("People living in each city: $peopleCities")
    println("Last person living in each city: $lastPersonCity")
}