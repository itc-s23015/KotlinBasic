package org.example

import kotlin.random.Random
import kotlin.random.nextUInt

fun main(args: Array<String>) {
    println("1:グー 2:チョキ 3:パー　を選んでください")
    // 入力は１，２，３，ですが０，１，２となるように工夫してください
    val player = readln().toInt()

    // CPUの手をランダムで決める
    val cpu = Random.nextInt(0,3)   //012

    val judge = when {
        player == cpu -> "あいこ"
        player == 0 && cpu == 1 || player == 1 && cpu == 2 || player == 2 && cpu == 0 -> "勝ち"
        player == 1 && cpu == 0 || player == 2 && cpu == 1 || player == 0 && cpu == 2 -> "負け"
        else
            -> "?"
    }
    println("cpu: ${cpu +1} --- $judge")
}

    /*別の方法
      val diff = (player - cpu + 3) % 3
      val judge = when (diff){
            0 ->    "あいこ"
            1 ->    "まけ"
            2 ->    "かち"
            else -> "?"
    }
     */