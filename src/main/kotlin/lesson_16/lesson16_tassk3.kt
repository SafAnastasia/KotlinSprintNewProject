package org.example.lesson_16

class User(val login: String, private val password: String) {
    fun passwordValidation(input: String): Boolean {
        return input == password
    }
}

fun main() {
    val user = User("anna2334", "1234567")
    val inputPassword = "243546"
    val correctPassword = user.passwordValidation(inputPassword)
    println("Введен корректный пароль: $correctPassword")
}