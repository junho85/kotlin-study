package kr.pe.junho85.kia.part1.ch2.two_5

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber3(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    }
    catch (e: NumberFormatException) {
        null
    }
    println(number)
}

fun main() {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber3(reader)
}