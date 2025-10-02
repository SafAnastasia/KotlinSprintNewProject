package org.example.lesson_20

fun main() {
    val listElements = listOf("1", "2", "3", "4")
    val reformattedList: List<() -> Unit> = listElements.map { element ->
        { -> println("Нажат элемент $element") }
    }
    reformattedList.forEachIndexed { index, action ->
        if (index % 2 == 0) {
            action()
        }
    }
}

