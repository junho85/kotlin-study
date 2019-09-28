package kr.pe.junho85.kia.part1.ch3.three_2

import strings.joinToString

fun main() {
    val list = listOf(1, 2, 3)
    joinToString(list)
    println(joinToString(list, ", ", "", "")) // 1, 2, 3
}