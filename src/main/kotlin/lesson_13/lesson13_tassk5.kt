package org.example.lesson_13

class NewPhoneBookContact(
    val name: String,
    val number: Long,
    val company: String? = null
) {
    fun printInfo() {
        println("Имя: $name, Телефон: $number, Компания: ${company ?: "не указана"}")
    }
}

fun main() {
    println("Введите номер телефона: ")
    val phoneNumber = readLine() ?: ""
    try {
        val input: Long = phoneNumber.toLong()
        println("Номер преобразован: $input")
    } catch (e: NumberFormatException) {
        println(e.javaClass.name)
    }
}