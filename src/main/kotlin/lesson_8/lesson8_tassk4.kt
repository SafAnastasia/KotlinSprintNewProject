package org.example.lesson_8

fun main(){
    val ingredients = arrayOf("морковь", "салат", "редис", "огурец")
    println("Какой ингредиент хотели ли бы заменить? ")
    val ingredient = readLine()!!
    println("Введите ингредиент на который нужно заменить: ")
    val ingredient2 = readLine()!!
    val ingredient3 = ingredients.indexOf(ingredient)

    if (ingredient !in ingredients) {
        println("Этого ингредиента нет в списке")
    } else {
        ingredients[ingredient3] = ingredient2
        println("Готово! Вы сохранили следующий список: ${ingredients.joinToString()}")
    }
}