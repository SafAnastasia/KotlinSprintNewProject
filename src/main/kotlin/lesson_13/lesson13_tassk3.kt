package org.example.lesson_13

class ContactDirectory (
    var name: String,
    var number: Long,
    var company: String? = null
) {
    fun contactInformation () {
        println("Имя: $name, Номер телефона: $number, Компания: ${company?: "<не указанно>"}")
    }
}
fun main() {
    val contacts =  listOf (
        ContactDirectory("Анна",89078906967, null),
        ContactDirectory("Артем", 89065478987, null),
        ContactDirectory("Алина", 89054783938, "null"),
        ContactDirectory("Лиса", 89048906789, "Google"),
        ContactDirectory("Дима", 89076785674, "Mail"))
    println("Список в телефонной книге:")
    contacts.mapNotNull { it.company }
    contacts.filter { it.lowercase() != "null" }
    contacts.forEach { println(it) }
}