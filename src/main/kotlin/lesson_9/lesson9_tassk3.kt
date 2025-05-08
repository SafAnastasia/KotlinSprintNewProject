package org.example.lesson_9

fun main() {
    val omeletIngredients = mutableListOf(2, 50, 15)
    println("Яйца: ${omeletIngredients[0]} шт.")
    println("Молоко: ${omeletIngredients[1]} мл.")
    println("Сливочное масло: ${omeletIngredients[2]} гр.")

    println("Введите количество ингредиентов: ")
    val quantityOfIngredients = readln().toInt()

    omeletIngredients[0] *= quantityOfIngredients
    omeletIngredients[1] *= quantityOfIngredients
    omeletIngredients[2] *= quantityOfIngredients

    println("На $quantityOfIngredients порций вам понадобится: Яиц – ${omeletIngredients[0]} шт., молока – ${omeletIngredients[1]} мл., сливочного масла – ${omeletIngredients[2]} гр.")
}