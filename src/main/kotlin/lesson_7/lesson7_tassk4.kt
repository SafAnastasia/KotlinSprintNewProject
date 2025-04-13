package org.example.lesson_7

fun main() {
    println("Введите количество секунд: ")
    val second = readLine()
    val number = second!!.toInt()
    for (i in number downTo 0) {
        println("Секунда: $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}