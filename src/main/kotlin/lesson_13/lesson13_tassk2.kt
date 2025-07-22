package org.example.lesson_13

class TelDirectory (
    var name: String,
    var number: Long,
    var company: String? = null
) {
    fun contactInformation () {
        println("Имя: $name, Номер телефона: $number, Компания: ${company?: "<не указанно>"}")
    }
}
fun main() {
    val contact = TelDirectory("Анна",89078906967)
    contact.contactInformation()
}


