package kr.pe.junho85.kia.part1.ch8.eight_1

fun performRequest(
    url: String,
    callback: (code: Int, content: String) -> Unit // 함수 타입의 각 파라미터에 이름을 붙인다.
) {
    /*...*/
}

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun main() {

    val sum = { x: Int, y: Int -> x + y }
    val sum2: (Int, Int) -> Int = { x, y -> x + y }
    val action = { println(42) }

    val x = 0
    val y = 0
    var canReturnNull: (Int, Int) -> Int? = { x, y -> null }
    var funOrNull: ((Int, Int) -> Int)? = null

    println(sum(1, 2))
    println(sum2(1, 2))
    action()

    val url = "http://kotl.in"
    performRequest(url) { code, content -> /*...*/ } // API에서 제공하는 이름을 람다에 사용
    performRequest(url) { code, page -> /*...*/ } // 원하는 다른 이름 쓸 수 있음

    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }


}