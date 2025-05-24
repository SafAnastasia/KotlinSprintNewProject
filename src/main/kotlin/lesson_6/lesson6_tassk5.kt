package org.example.lesson_6

fun main() {
    val attempts = 3

    for (attempt in 0..attempts) {
        val number1 = (1..10).random()
        val number2 = (1..10).random()
        var numberSumm = number2 + number1

        println("Попытка $attempt из $attempts")
        println("Напишите сумма чисел: $number1 + $number2 = ")

        val userNumber = readln().toInt()

        if (userNumber == numberSumm) {
            println("Добро пожаловать")
            return
        } else {
            println("Не верно")
        }
        println("Доступ запрещен")
    }
}
