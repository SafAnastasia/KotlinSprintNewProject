package org.example.lesson_13

class PhoneContact(
    val name: String,
    val number: Long,
    val company: String? = null
)

fun main() {
    val contacts = listOf(
        PhoneContact("Анна", 89078906967, null),
        PhoneContact("Артем", 89065478987, null),
        PhoneContact("Алина", 89054783938, "null"),
        PhoneContact("Лиса", 89048906789, "Google"),
        PhoneContact("Дима", 89076785674, "Mail")
    )
    contacts.mapNotNull { it.company }
        .distinct()
        .forEach { println(it) }
}
