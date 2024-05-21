package org.example

fun main(args: Array<String>) {
    val x = 9 downTo 1
    val y = 1 ..10

   println("    ")
    for (xi in x) {
        println("$xi")
    }
    println()

    for (yi in y){
        println("$yi")
        for(xi in x) {
            println("${xi * yi}")
        }
        println()
    }
}