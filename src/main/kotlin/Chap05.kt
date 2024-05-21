package org.example

fun main(args: Array<String>) {
    val a: Char = 'え'
    val b: Char = 'び'
    val c: Char = 'し'
    println(a)
    println(b)
    println(c)
    val message: String = "こんにちは、\n世界!"
    println(message)

//    val message5 = a5 + b5
    println(message)
//    println(a5 + b5)
//    println("こんにちは、$b5")
    println("----5.8---")
    val h = 8
    println("本日働いた時間は、${h}hours")
    println("このペースで１ヶ月働くと、${h * 30}hours の労働になります")
    println("このペースで１年間働くと、${h * 365}hours の労働になります")
    println("----5.12----")
    val message12 = """|
        |こんにちは、世界！
        |私はKotlinについて勉強しています
        |Kotlinでは、とても簡潔なプログラムを書くことができます
        |皆さん、一緒に楽しくプログラミングをしましょう
    """.trimMargin()
    println(message12)

    val message13 = """
        こんにちは、世界！
        私はKotlinについて勉強しています
        Kotlinでは、とても簡潔なプログラムを書くことができます
        皆さん、一緒に楽しくプログラミングをしましょう
    """.trimIndent()
    println(message13)
}