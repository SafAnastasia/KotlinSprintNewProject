package org.example.lesson_22

class NewRegularBook(val name: String, val author: String)

data class NewDataBook(val name: String, val author: String)

fun main() {
    val author1 = NewRegularBook("Name1", "Author1")
    val author2 = NewDataBook("Name2", "Author2")

    println("Вывод в обычном классе: ${author1}") //Вывод будет содержать имя класса и адрес в памяти
    println("Вывод в дата классе: ${author2}") //Вывод будет содержать имя класса и значения свойств
}