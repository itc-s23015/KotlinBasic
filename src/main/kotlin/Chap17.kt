package org.example

fun main(args: Array<String>) {
    println("----17.2----")
    val a: List<Int> = listOf(1000, 1200, 1500)

    println("1年目の時給は ${a[0]}円です")
    println("2年目の時給は ${a[1]}円です")
    println("3年目の時給は ${a[2]}円です")

    for (money in a) {
        println("時給は ${money}円です")
    }

    for((index, money) in a.withIndex()) {
        println("${index+1}年目の時給は $[money}です")
    }

    //17.3
    val a3 = listOf<Boolean>(true, false, true)
    val b3 = listOf<Byte>(2, 4, 8)
    val c3 = listOf<Short>(100, 101, 102)
    val d3 = listOf<Int>(1000, 1200, 1500)
    val e3 = listOf<Long>(100000, 120000, 150000)
    val f3 = listOf<Float>(1.0f, 1.1f, 1.2f)
    val g3 = listOf<Double>(1.0, 10.0, 100.0)
    val h3 = listOf<String>("こんにちは", "Kotlin", "よろしく")

    //17.7
    val a7: MutableList<String> = mutableListOf("こんにちは", "Kotlin", "よろしく")
    a7.add("どうぞ")
    a7.add("よろしくおねがいします")
    for((i, x) in a7.withIndex()) println("${i} : ${x}")

    //17.8
    val a8:MutableList<String> = mutableListOf("こんにちは", "Kotlin", "よろしく")
    a8.add(2, "どうぞ")
    a8.add(0, "はじめまして！")
    for((i,x) in a8.withIndex()) println("${i} : ${x}")

    //17.9
    val a9: MutableList<String> = mutableListOf("こんにちは", "Kotlin", "どうぞ", "よろしく")
    a9.removeAt(2)
    for((i, x)in a9.withIndex()) println("${i} : ${x}")
}