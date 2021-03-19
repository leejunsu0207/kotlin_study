package org.kotlinlang.play

interface SoundBehavior {                                                          // 하나의 메서드로 SoundBehavior 인터페이스를 정의합니다.
    fun makeSound()
}

class ScreamBehavior(val n:String): SoundBehavior {                                // 클래스는 Scream Behavior와 RockAndroll Behavior는 인터페이스를 구현하며 메소드의 자체 구현을 포함합니다.
    override fun makeSound() = println("${n.toUpperCase()} !!!")
}

class RockAndRollBehavior(val n:String): SoundBehavior {                           // 클래스는 Scream Behavior와 RockAndroll Behavior는 인터페이스를 구현하며 메소드의 자체 구현을 포함합니다.
    override fun makeSound() = println("I'm The King of Rock 'N' Roll: $n")
}

// Tom Araya is the "singer" of Slayer
class TomAraya(n:String): SoundBehavior by ScreamBehavior(n)                       // Tom Araya와 Elvis Presley 클래스도 인터페이스를 구현하지만 메소드는 구현하지 않습니다.
                                                                                    // 대신, 담당 구현에 메서드 호출을 위임합니다.
                                                                                    // 위임 개체는 키워드별 뒤에 정의됩니다.
                                                                                    // 보시다시피 보일러 플레이트 코드는 필요하지 않습니다.

// You should know ;)
class ElvisPresley(n:String): SoundBehavior by RockAndRollBehavior(n)              // Tom Araya와 Elvis Presley 클래스도 인터페이스를 구현하지만 메소드는 구현하지 않습니다.
                                                                                    // 대신, 담당 구현에 메서드 호출을 위임합니다.
                                                                                    // 위임 개체는 키워드별 뒤에 정의됩니다.
                                                                                    // 보시다시피 보일러 플레이트 코드는 필요하지 않습니다.

fun main() {
    val tomAraya = TomAraya("Thrash Metal")
    tomAraya.makeSound()                                                           // makeSound()가 Tom Araya 유형의 Araya 또는 Elvis Presley 유형의 Elvis Presley로 호출되면 해당 대리인 객체에 호출됩니다.
    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvisPresley.makeSound()
}