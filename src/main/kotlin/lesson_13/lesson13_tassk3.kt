package org.example.lesson_13

class PhoneBook(
    val name: String,
    var number: Long,
    var company: String? = null
)

fun main() {
    val contacts = listOf(
        PhoneBook("Анна", 89078906967, null),
        PhoneBook("Артем", 89065478987, null),
        PhoneBook("Алина", 89054783938, "null"),
        PhoneBook("Лиса", 89048906789, "Google"),
        PhoneBook("Дима", 89076785674, "Mail")
    )

    fun List<PhoneBook>.printInfo() {
        for (contact in this) {
            println(contact.company)
        }
    }
    contacts.printInfo()
}