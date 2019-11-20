package kr.pe.junho85.kia.part1.ch3.three_6.six_12

import java.lang.IllegalArgumentException

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
    // user를 데이터베이스에 저장한다.
}

fun main() {
    saveUser(User(1, "", ""))
}