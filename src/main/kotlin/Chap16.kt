package org.example

fun main(args: Array<String>) {
    val a: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400)
    println("1年目の時給は ${a[0]}円です")
    println("2年目の時給は ${a[1]}円です")
    println("3年目の時給は ${a[2]}円です")
    println("4年目の時給は ${a[3]}円です")
    println("5年目の時給は ${a[4]}円です")

    //16.3
    val a3: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400)
    for (i in 0..4) {
        println("${i+1}年目の時給 ${a3[i]}は円です")
    }

    //16.4
    val a4: IntArray = intArrayOf(1000, 1200, 1500, 1800, 2400, 3000, 3800)
    for (i in 0..4) {
        println("${i+1}年目の時給 ${a4[i]}は円です")
    }

    //16.5
    for (i in 0..<a4.count()) {
        println("${i+1}年目の時給 ${a4[i]}は円です")
    }

    //16.6
    for (money in a4) {
        println("時給は${money}円です")
    }

    //16.7
    for ((index, money) in a4.withIndex()) {
        println("${index+1}年目の時給 ${money}}は円です")
    }
}