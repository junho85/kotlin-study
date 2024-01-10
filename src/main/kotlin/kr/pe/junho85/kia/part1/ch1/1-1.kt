package kr.pe.junho85.kia.part1.ch1

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(
        Person("영희"),
        Person("철수", age = 29)
    )
    val oldest = persons.maxOf { it.age ?: 0 }
    println("나이가 가장 많은 사람: $oldest") // 나이가 가장 많은 사람: Person(name=철수, age=29)
}

