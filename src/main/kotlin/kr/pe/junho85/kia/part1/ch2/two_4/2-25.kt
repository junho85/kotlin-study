package kr.pe.junho85.kia.part1.ch2.two_4

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'0'

fun main() {
    println(isLetter('q'))
    println(isNotDigit('x'))
}