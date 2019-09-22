package kr.pe.junho85.kia.part1.two_4

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know..."
}
fun main() {
    println(recognize('8'))
    println("Kotlin" in "Java".."Scala") // true. "Java" <= "Kotlin" && "Kotlin" <= "Scala"
    println("Kotlin" in setOf("Java", "Scala")) // false. "Java" <= "Kotlin" && "Kotlin" <= "Scala"
}