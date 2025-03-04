package org.example.lesson_5

const val MAJORITY = 18

fun main() {
    println("Напишите год рождения: ")
    val userAge = readln().toInt()
    if (userAge >= 2025 - MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран приложения")
    }
}

