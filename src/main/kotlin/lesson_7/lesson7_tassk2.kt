package org.example.lesson_7

fun main() {
    while (true) {
        val numbers = (1000..9999).random()
        println("Ваш код авторизации: $numbers")

        println("Введите код: ")
        val userСode = readLine()

        if (userСode == numbers.toString()) {
            println("Добро пожаловать")
            break
        } else {
            println("Код введен неверно. Попробуйте снова.")
        }
    }

}





