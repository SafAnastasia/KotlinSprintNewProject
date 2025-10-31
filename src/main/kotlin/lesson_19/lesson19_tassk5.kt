package org.example.lesson_19

enum class Gender {
    MALE,
    FEMALE
}

data class Person(
    val name: String,
    val gender: Gender
)

fun main() {
    val cardIndex = mutableListOf<Person>()

    println("Картотека")
    println("Введите данные 5 человек.")
    println("Формат: Имя Пол")
    println("Пол: MALE или FEMALE")

    while (cardIndex.size < 5) {
        println("Введите данные ${cardIndex.size + 1}:")

        val input = readln().trim()

        val words = input.split(" ")
        val name = words[0]
        val genderStr = words.getOrNull(1)?.uppercase() ?: "MALE"

        val gender = try {
            Gender.valueOf(genderStr)
        } catch (e: Exception) {
            println("Неверный пол")
            Gender.MALE
        }
        println("Картотека")
        cardIndex.forEachIndexed { i, p ->
            val rus = if (p.gender == Gender.MALE) "мужской" else "женский"
            println("${i + 1}. ${p.name} - $rus")
        }
    }
}