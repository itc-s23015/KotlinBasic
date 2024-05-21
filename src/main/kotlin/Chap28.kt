package com.example.chap28

import com.example.chap27.Car5

fun main(args: Array<String>) {

}

class Ferrari (color: String) : Car5(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のフェラーリが走っています！")
        println("おおっ、かっこいい１！！")
        println("マイレージは ${distance}キロになったぜい")
    }
}

class Prius(color: String) : Car5(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のプリウスが走っています")
        println("すごい静かですね")
        println("マイレージは${distance}キロです")
        println("トヨタの車はいっぱい走ってもなかなか故障しません")
    }
}