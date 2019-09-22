package kr.pe.junho85.kia.part1

// 2.22
fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main() {
    // 2-22
//    for (i in 1..100) {
//        print(fizzBuzz(i))
//    }

    // 2-23
    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
}
