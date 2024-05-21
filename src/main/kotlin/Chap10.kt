package org.example

fun main(args: Array<String>) {
    val a: IntRange = 0..6
    val b: IntRange = 7..12
    val c: IntRange = 13..15
    println(a)
    println(b)
    println(c)

    val age2: Int = 10

    val range1: IntRange = 0..6
    val range2: IntRange = 7..12
    val range3: IntRange = 13..15

    val flag1 = age2 in range1
    val flag2 = age2 in range2
    val flag3 = age2 in range3

    println("${age2}歳の子供は就学前 ${flag1}")
    println("${age2}歳の子供は小学生 ${flag2}")
    println("${age2}歳の子供は中学生 ${flag3}")

    val range_a: LongRange = 0..10_000_000_000L
    val range_b: CharRange = 'A'..'E'
    val range_c: CharRange = 'あ'..'お'

    val flag_a = 500 in range_a
    val flag_b = 'D' in range_b
    val flag_c = 'え' in range_c
    println("flag_a=$flag_a")
    println("flag_b=$flag_b")
    println("flag_c=$flag_c")

    println("---10.a----")
    val rangeD: IntRange = 0 until 6
    val rangeE: IntRange = 0..6
    println(rangeD)
    println(rangeE)
}