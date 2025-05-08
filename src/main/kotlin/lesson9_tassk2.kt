package org.example

fun main() {
    val listOfIngredients = mutableListOf("яйца", "молоко", "мука")
    println("В рецепте есть базовые ингредиенты: $listOfIngredients")
    println("Желаете добавить еще?")
    val addIngredient = readln()
    if (addIngredient.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        listOfIngredients.add(newIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
    } else {
        println("Завершить программу")
    }
}

