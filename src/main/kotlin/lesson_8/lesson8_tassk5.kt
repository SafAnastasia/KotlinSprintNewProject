package org.example.lesson_8

fun main() {
    println("Введите количество ингредиентов: ")
    val quantityOfIngredients = readln().toInt()
    val igredients = Array<String>(quantityOfIngredients) { "" }

    for (i in 0 until quantityOfIngredients) {
        println("Введите ингредиент №${i + 1}: ")
        igredients[i] = readln()
    }
    println("Список ингредиентов: ${igredients.joinToString(",")}")
}