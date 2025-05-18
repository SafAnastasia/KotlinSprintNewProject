package org.example.lesson_10

fun main() {
    println("Введите длину пароля: ")
    val input = readln().toInt()
    val password = passwordLength(input)
    println("Сгенерированный пароль: $password")
}

fun passwordLength(length: Int): String {
    val numbers = (0..9)
    val symbols = (32..47).map { it.toChar() }
    val password = StringBuilder()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            password.append(numbers.random())
        } else {
            password.append(symbols.random())
        }
    }
    return password.toString()
}


