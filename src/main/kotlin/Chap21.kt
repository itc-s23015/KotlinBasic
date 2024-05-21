package org.example

fun main(args: Array<String>) {
    val answer0: Int = getThreeTimes(5)
    run {
        println(answer0)
    }
    run {
        val answer: Int = getTimes(2,3)
        println("変数の値$answer")
    }
    run {
        printTimes(2, 3, 4)
        printTimes(5, 10, 8)
        printTimes(1, 2, 100)
    }
    run {
//        printTimes(2,3)
        printTimes(5, 10, 20)
//        printTimes(1,10,100,1000)
//        printTimes(2,2,2, 2, 2, 2, 2, 2)
    }
}


//fun getThreeTimes(value: Int): Int {
//    return value * 3
//}

fun getThreeTimes(value: Int): Int = value * 3

fun getTimes(x: Int, y: Int) = x * y

fun getTimes(x: Int, y: Int, z: Int) : Unit {
    println("パラメータとして、${x}と${y}と${z}を受け取りました")
    println("これらの値を全部掛け算した答えは${x * y * z} です")
}


fun printTimes(x: Int, y: Int, z: Int) {
    println("---------------------------------------------")
    println("パラメータとして、${x}と${y}と${z}を受け取りました")
    println("これらの値を全部掛け算した答えは${x * y * z} です")
    println("---------------------------------------------")

fun printTimes(vararg numbers: Int) {
    var result = 1
    for (x in numbers) {
            result *= x
    }
    println("すべての数値を掛け算した結果:$result")
    }
}