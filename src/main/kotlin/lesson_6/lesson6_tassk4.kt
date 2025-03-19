package org.example.lesson_6

fun main() {
    var attempt = 5

    while (attempt > 0) {
        println("Введите число: ")
        val number = readln().toInt()

        if (number in 1..9) {
            println("Это была великолепная игра!")
        } else {
            attempt--
            if (attempt > 0) {
                println("Неверно, осталось попыток $attempt")
            } else {
                println("Было загаданно число $number")
            }
        }
    }
}