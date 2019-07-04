package kr.pe.junho85

import java.util.*

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun test() {
    val PI = 3.14
    var x = 0

    fun incrementX() {
        x += 1
    }

    incrementX()
    println(x)
}

fun main() {
    println(sum(1, 2))
    println(sum2(2, 3))
    printSum(3, 4)

    // Defining variables
    val a: Int = 1 // immediate assignment
    val b = 2 // `Int` type is inferred (Int 자료형이 추론된다)
    val c: Int // Type required when no initializer is provided (초깃값이 없으면 추론을 못하니 자료형이 필요하다)
    c = 3 // deferred assignment

    var x = 5
    x += 1
    println("x is $x")

    test()
}