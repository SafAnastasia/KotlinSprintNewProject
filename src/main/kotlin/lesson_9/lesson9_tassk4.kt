package org.example.lesson_9

fun main() {
    println("Введите названия 5ти ингредиентов: ")
    val newIngredients = readln()
    val ingredients = newIngredients.split(",").map { it.trim() }

    val sortedIngredients = ingredients.sorted()
    println("Отсортированный список: $sortedIngredients")
}