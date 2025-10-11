package org.example.lesson_22

data class Person(val name: String, val age: Int, val city: String)

fun main() {
    val person = Person("Игорь", 34, "Владивосток")
    val (name, age, city) = person

    println("Имя: $name")
    println("Возраст: $age")
    println("Город: $city")
}