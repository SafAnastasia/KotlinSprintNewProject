package org.example.lesson_7

fun main() {
    val letters = ('a'..'z')
    val numbers = (0..9)
    val passwordSize = 6
    val password = StringBuilder()

    for (i in passwordSize downTo 1) {
        if (i % 2 == 0) {
            password.append(numbers.shuffled().first())
        } else {
            password.append(letters.shuffled().first())
        }
    }
    println("Пароль: $password ")
}
