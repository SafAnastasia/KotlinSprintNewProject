package org.example.lesson_9

fun main() {
    println("Введите названия 5ти ингредиентов: ")
    val newIngredients = readln().split(",").sorted()
    println("Отсортированный список: $newIngredients")
}