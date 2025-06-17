package org.example.lesson_5

fun main() {
    val randomNumbers = (0..42).shuffled().take(3).toList()
    print("Введите 3 числа, разделенные запятой: ")
    val userNumbers = readln()
    val numbers = userNumbers.split(",").toList()

    val comparisonList = randomNumbers intersect numbers
    val sizeList = comparisonList.size

    when (sizeList) {
        3 -> println("Вы выиграли джекпот")
        2 -> println("Вы угадали два числа и выиграли крупный приз")
        1 -> println("Вы угадали одно число и выиграли утешительный приз")
        else -> println("Вы не угадали ни одного числа")
    }
    println("Выигрышные числа: $randomNumbers")
}