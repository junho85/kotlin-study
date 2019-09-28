package kr.pe.junho85.kia.part1.ch3.three_1

fun main() {
    val set = hashSetOf(1, 7, 53)
    println(set) // [1, 53, 7]

    val list = arrayListOf(1, 7, 53)
    println(list) // [1, 7, 53]
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(map) // {1=one, 53=fifty-three, 7=seven}

    println(set.javaClass) // class java.util.HashSet
    println(list.javaClass) // class java.util.ArrayList
    println(map.javaClass) // class java.util.HashMap

    val strings = listOf("first", "second", "fourteenth")
    println(strings.last()) // fourteenth

    val numbers = setOf(1, 14, 2)
    println(numbers.max()) // 14
}