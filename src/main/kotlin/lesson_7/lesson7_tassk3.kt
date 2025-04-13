package org.example.lesson_7

fun main() {
    println("Введите число: ")
    val number = readLine().toInt()
    for (i in 0..number step 2) {
        println("Четное число: $i")
    }
}