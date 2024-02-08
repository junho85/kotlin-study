package kr.pe.junho85.generics

open class Fruit
class Apple : Fruit()
class Banana : Fruit()

//fun receiveFruits(fruits: Array<Fruit>) {
fun receiveFruits(fruits: List<Fruit>) {
    println("Number of fruits: ${fruits.size}")
}

fun main() {
//    val fruits: Array<Apple> = arrayOf(Apple(), Apple()) // public class Array<T>
//    val fruits: List<Apple> = listOf(Apple(), Apple()) // public interface List<out E> : Collection<E>
    val fruits: List<Fruit> = listOf(Apple(), Banana()) // public interface List<out E> : Collection<E>
    receiveFruits(fruits)
}
