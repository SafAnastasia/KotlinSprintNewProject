package org.example.lesson_7

fun main() {

    println("Введите число: ")
    val number = readLine()
    val number1 = StringBuilder()

    for (i in 0..number!!.toInt()) {
        if (i % 2 == 0) {
            number1.append("$i")
            println("Четное число: $i")

        }

    }
}