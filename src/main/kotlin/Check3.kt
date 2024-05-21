package org.example

import kotlin.random.Random

fun main(args: Array<String>) {
    //　勝ちが1割、負けが8.5割、あいこ0.5割となる
    //  CPUを実装したじゃんけんを作ってください
    println("1:グー2:チョキ3:パー　を選んでください")
    val player = readln().toInt() - 1

    val result = when (Random.nextInt(0,100)) {
        in 0..<10 ->2         //勝ち
        in 10..<15 -> 0     //あいこ
        else -> 1               //負け
    }

    //CPU の手を計算で求める
    val cpu = (player + result) % 3

    val judge = when(result){
        0 -> "あいこ"
        1 -> "勝ち"
        else -> "負け"
    }

    println("CPU: ${cpu +1} ---$judge")
}