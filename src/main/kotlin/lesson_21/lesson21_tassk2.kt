package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun main() {
    val numbers = listOf(2, 4, 6, 7)
    val sumNumbers = numbers.evenNumbersSum()
    println("Сумма четных чисел: $sumNumbers")
}