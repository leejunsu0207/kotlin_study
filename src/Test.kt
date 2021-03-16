fun main() {

    // final
    val temp:Int = 1

    // int, string, float, double
    var temp0:String? = null // ? == 변수에 null값 허용한다는 문법
    var temp1:String = "Hello kotlin"

    println(temp)
    println(temp0)
    print(temp1)
    println(hello0())
    print(hello())


}


fun hello0() { // void hello0(){}

}
fun hello(): String{  //private String hello()
    return "객체 hello"
}