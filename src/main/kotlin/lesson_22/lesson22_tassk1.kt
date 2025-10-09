package org.example.lesson_22

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)

fun main() {
    val author1 = RegularBook("Name1", "Author1")
    val author2 = RegularBook("Name2", "Author2")

    val author3 = DataBook("Name3", "Author3")
    val author4 = DataBook("Name4", "Author4")

    println("Сравнение в классе: ${author1 === author2}")
    println("Cравнение в дата классе: ${author3 === author4}")
}