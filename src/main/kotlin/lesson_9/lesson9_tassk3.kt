package org.example.lesson_9

fun main() {
    val omeletIngredients = mutableListOf(2, 50, 15)
    println("Яйца: ${omeletIngredients[0]} шт.")
    println("Молоко: ${omeletIngredients[1]} мл.")
    println("Сливочное масло: ${omeletIngredients[2]} гр.")

    println("Введите количество ингредиентов: ")
    val quantityOfIngredients = readln().toInt()

    val newOmeletIngredients = omeletIngredients.map {it * quantityOfIngredients}

    println("На $newOmeletIngredients порций вам понадобится: Яиц – ${newOmeletIngredients[0]} шт., молока – ${newOmeletIngredients[1]} мл., сливочного масла – ${newOmeletIngredients[2]} гр.")
}