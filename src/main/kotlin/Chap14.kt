package org.example

import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {
    while (Random.nextInt(0..<100) >= 10) {
        println("10以上の数が表示されました")
    }
    println("終わり")

    println("---14.2---")
    do {
        val rand  = Random.nextInt(0..<100)
        println("生成された数は$rand です")
    } while (rand >= 10)
    println("10未満の数が生成されたので終わり")
}