package org.example.lesson_8

fun main() {
    val pancakeRecipe = arrayOf("яйца", "молоко", "соль", "мука", "дрожжи")
    println("Какой ингредиент нужно найти в рецепте: ")
    val ingredient = readLine()

    if (pancakeRecipe.contains(ingredient)) {
        println("Ингредиент $ingredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}