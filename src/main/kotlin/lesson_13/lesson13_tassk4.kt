package org.example.lesson_13

class PhoneBookContact(
    val name: String,
    val number: Long,
    val company: String? = null
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
        if (name.isEmpty()) break

        println("Введите номер телефона: ")
        val number = readln().trim().toLongOrNull()

        if (number == null) {
            println("Вы не ввели номер телефона:")
            continue
        }

        println("Введите название компании: ")
        val nameCompany = readln().trim()
        val company = if (nameCompany.isEmpty()) null else nameCompany

        val contact = PhoneBookContact(name, number, company)
        contacts.add(contact)
        println("Контакт добавлен")
    }
    println("\n Список контактов: " )
    for (contact in contacts) {
        contact.printInfo()
    }

}