package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("морковь", "салат", "редис", "огурец")
    println("Какой ингредиент хотели ли бы заменить? ")
    val ingredient = readln()
    println("Введите ингредиент на который нужно заменить: ")
    val ingredient2 = readln()

    if (ingredient !in ingredients) {
        println("Этого ингредиента нет в списке")
    } else {
        val index = ingredients.indexOf(ingredient)
        ingredients[index] = ingredient2
        println("Готово! Вы сохранили следующий список: ${ingredients.joinToString()}")
    }
}