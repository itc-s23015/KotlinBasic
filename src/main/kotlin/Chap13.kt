package org.example

fun main(args: Array<String>) {
    val x = 5
    for(i in 1..9) {
        println("${x}かける${i}は、${x*i}です")
    }
    println("----13.7---")
    for(i in 9 downTo 1) {
        println("${x}かける${i}は、${x*i}です")
    }
    println("----13.8---")
    for(i in 9 downTo 1 step 2) {
        println("${x}かける${i}は、${x*i}です")
    }
}