package com.example.chap25

fun main(args: Array<String>) {
    run {
        val p1 = Person7()
        val p2 = Person7(name = "たけし")
        val p3 = Person7(age =  7)
        p1.greet()
        p2.greet()
        p3.greet()
    }

    run {
        val p1 = Person8("たけし", 7)
        val p2 = Person8(name = "たけし", age= 7)
        val p3 = Person8(age = 7, name = "たけし")
        p1.greet()
        p2.greet()
        p3.greet()
    }

    run {
        val p1 = Person9("たけし", 7)
    }
}

class Person7(val name: String = "名無しさん", var age: Int = 20) {
    fun greet() {
        println("${name}です, ${age}歳です")
    }
}

class Person8(val name: String, var age: Int) {
    fun greet(){
        println("${name}です。${age}歳です")
    }
}

class Person9(val name: String, var age: Int) {
    init {
        println("コンストラクタ のイニシャライザが呼ばれました")
        greet()
    }
    fun greet(){
        println("${name}です。${age}歳です")
    }
}