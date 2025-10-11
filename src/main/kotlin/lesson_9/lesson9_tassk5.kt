package org.example.lesson_9

fun main() {
    println("Введите ниже 5 ингредиентов, каждый ингредиент нужно ввести с новой строки:")
    val listOfIngredients = MutableList(5) { readln().trim() }.toSet().sorted()
    val uniqueList = listOfIngredients.toSet().sorted()

    val formattedList = uniqueList.mapIndexed { index, item ->
        if (index == 0) item.replaceFirstChar { it.uppercaseChar() } else item
    }
    println(formattedList.joinToString(","))
}