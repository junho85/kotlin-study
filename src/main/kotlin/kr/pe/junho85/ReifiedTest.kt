package kr.pe.junho85

fun main() {
    println("Hello, world!!!")
    doSomething("Hello", String::class.java)
    doSomething(1, Int::class.java)

    doSomething2("Hello")
    doSomething2(1)
}

fun <T> doSomething(someValue: T, type: Class<T>) {
    println("Doing something with $someValue")
    println("Doing something with type: ${type.simpleName}")
    // class Type T 객체는 타입에 대한 정보가 런타임에서 Type Erase 되어버려 알 수 없어짐
    // 그래서 실행하면 에러가 발생함. 왜냐하면 타입을 알 수 없기 때문.

    // 에러: Cannot use 'T' as reified type parameter. Use a class instead.
//    println("Doing something with type: ${T::class.simpleName}")
}

// inline 함수와 reified 키워드를 함께 사용하면 T type에 대해서 런타임에 접근할 수 있게 해줌
// 따라서 타입을 유지하기 위해서 Class와 같은 추가 파라미터를 넘길 필요가 없어짐
inline fun <reified T> doSomething2(someValue: T) {
    println("Doing something with $someValue")
    println("Doing something with type: ${T::class.simpleName}")
}