package org.example.lesson_9

fun main() {
    println("Введите название первого ингредиента: ")
    val firstElement = readln()
    println("Введите название второго ингредиента: ")
    val secondElement = readln()
    println("Введите название третьего ингредиента: ")
    val thirdElement = readln()
    println("Введите название четвертого ингредиента: ")
    val fourthElement = readln()
    println("Введите название пятого ингредиента: ")
    val fifthElement = readln()

    val listOfIngredients = listOf(firstElement, secondElement, thirdElement, fourthElement, fifthElement)
    val uniqueList = listOfIngredients.toSet().sorted()

    val formattedList = uniqueList.mapIndexed{index, item ->
        if (index == 0) item.replaceFirstChar { it.uppercaseChar() } else item
    }
    println(formattedList.joinToString (","))
}