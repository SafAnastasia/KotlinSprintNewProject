package org.example.lesson_13

class TelDirectory(
    val name: String,
    val number: Long,
    val company: String? = null
) {
    fun printInfo() {
        println("Имя: $name, \n Номер телефона: $number, \n Компания: ${company ?:  "<не указанно>"}")
    }
}

fun main() {
    val contact = TelDirectory("Анна", 89078906967)
    contact.printInfo()
}
