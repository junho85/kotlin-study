package kr.pe.junho85

import java.io.*

data class Person(val name: String, val age: Int) : Serializable

fun serialize(person: Person): ByteArray {
    val byteArrayOutputStream = ByteArrayOutputStream()
    val objectOutputStream = ObjectOutputStream(byteArrayOutputStream)
    objectOutputStream.writeObject(person)
    return byteArrayOutputStream.toByteArray()
}

fun deserialize(byteArray: ByteArray): Person {
    val byteArrayInputStream = ByteArrayInputStream(byteArray)
    val objectInputStream = ObjectInputStream(byteArrayInputStream)
    return objectInputStream.readObject() as Person
}

fun main() {
    // 객체 생성
    val person = Person("John Doe", 30)

    // 객체를 직렬화
    val serializedData = serialize(person)
    println("Serialized: ${serializedData.joinToString()}")

    // 직렬화된 데이터를 역직렬화
    val deserializedPerson = deserialize(serializedData)
    println("Deserialized: $deserializedPerson")
}
