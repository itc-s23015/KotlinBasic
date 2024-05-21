package org.example

fun main(args: Array<String>) {
    //19.1
    val map: MutableMap<String, String> = mutableMapOf(
        "Pen" to "ペン", "Apple" to "アップル", "Pineapple" to "パイナップル"
    )
    val value1 = map["Pen"]
    val value2 = map["Apple"]
    val value3 = map["Pineapple"]
    val value4 = map["Pen"]
    println("${value1}, ${value2}, ${value3}, ${value4}")

    //19.2
    val map2: Map<Char, Int> = mapOf('a' to 1, 'b' to 2, 'c' to 3, 'z' to 26)
    println(map2['a'])
    println(map2['b'])
    println(map2['c'])
    println(map2['z'])

    //19.4
    run {
        val map4 = mutableMapOf("pen" to "ペン")
        //map.put("Pen", "ペン")
        map4["Apple"] = "アップル"  //おすすめ
        //map += "Pineapple" to "パイナップル"
    }

   // 19.5
   run {
       val map5 = mutableMapOf<String, String>()
           map5.put("Pen", "ペン")
           map5["Apple"] = "アップル"
           map5["Pineapple"] = "パイナップル"
           val value1 = map["Pen"]
           val value2 = map["Pineapple"]
           val value3 = map["Apple"]
           map -= "Pen"
           val value4 = map["Pen"]
       println("${value1}, ${value2}, ${value3}, ${value4}")
   }
}