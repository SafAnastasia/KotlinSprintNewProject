package org.example.lesson_13

class PhoneBookContact(
    val name: String,
    var number: Long,
    var company: String? = null
) {
    fun printInfo() {
        println("Имя: $name, Телефон: $number, Компания: ${company ?: "не указана"}")
    }
}

fun main() {
    val contacts = mutableListOf<PhoneBookContact>()

    while (true) {
        println("Введите имя:")
        val name = readln().trim()

        println("Введите номер телефона: ")
        val user = readln().trim().toLongOrNull()

        if (user == null) {
            println("Вы не ввели номер телефона:")
            continue
        }

        println("Введите название компании: ")
        val nameCompany = readln().trim()
        val company = if (nameCompany == null) {
            println("null")
        }
        val contact = PhoneBookContact(name, number, company)
        contacts.add(contact)
        println("Контакт добавлен")
        for (contact in contacts) {
            contact.printInfo()
        }
    }
}