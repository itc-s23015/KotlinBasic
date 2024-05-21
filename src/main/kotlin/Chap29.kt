package com.example.chap29

fun main(args: Array<String>) {
    val car1 = Ferrari("rainbow")
    val car2 = Prius("yellow")
}

open class Car(val color: String) {
    var distance = 0.0
    open fun drive(d: Double) {
        distance += d
        println("${color}の車が${d}km走りました")
        println("その結果、マイレージは${distance}キロになりました")
    }
}

class Ferrari(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のフェラーリが走っています")
        println("おおっ、かっこいい！")
        println("マイレージは　${distance}キロになったぜい")
    }
}

class Prius(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のプリウスが走っています")
        println("すごい静かですね")
        println("マイレージは${distance}キロです。トヨタの車はいっぱい走ってもなかなか故障しません")
    }
}