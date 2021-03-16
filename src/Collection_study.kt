fun main(){
    // map

    var map0 = mapOf(Pair("number","1"))        // 수정 불가능
    var map1 = mutableMapOf<String, String>()   // 수정 가능
    map1.put("number","2")
    map1.put("String","ㄱ")

    for (item in map0){
        println(item)
    }
    println("------------------------------------");
    for (item2 in map1){
        println(item2)
        println(item2.value)
        println(item2.key)
    }

    println(map1.keys)  // 키 들만 출력




}