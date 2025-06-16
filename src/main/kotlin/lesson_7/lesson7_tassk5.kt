package org.example.lesson_7

fun main() {
    val lowerCase = ('a'..'z').toList()
    val upperRegister = ('A'..'Z').toList()
    val numbers = ('0'..'9').toList()

    println("Введите длину пароля: ")
    val passwordLength = readln().toInt()
    val symbols = lowerCase + upperRegister + numbers
    var password: String

    do {
        val passwordChars = List(passwordLength) { symbols.random() }
        password = passwordChars.joinToString("")
    } while (!(
                password.any { it in lowerCase } &&
                        password.any { it in upperRegister } &&
                        password.any { it in numbers }))
    println("Сгенерированный пароль: $password")
}
