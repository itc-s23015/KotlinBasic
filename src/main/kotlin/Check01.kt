package org.example

fun main(args: Array<String>) {
    println("点数を入力してください")
    val score = readln().toInt()

    //　成績判定
    //  0~59　は　D
    //  60~69　は　C
    //  70~79　は　B
    //  80~89　は A
    //  90~100　は　S
    // それ以外は「エラー」と出力

    val message = if (score in 0..59) {
        "D"
    } else if (score in 60..69) {
        "C"
    }else if (score in 70..79) {
        "B"
    }else if (score in 80..89) {
        "A"
    }else if (score in 90..100) {
        "S"
    }else{
        "エラー"
    }
    println(message)
}