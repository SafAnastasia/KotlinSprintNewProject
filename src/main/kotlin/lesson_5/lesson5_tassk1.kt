package org.example.lesson_5

val number1 = 2
val number2 = 2

fun main() {
    println("Решите простой пример: $number1 + $number2 = ?")
    val numbers = readln()!!.toInt()

    if (numbers == number1 + number2){
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }
}