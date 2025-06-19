package org.example.lesson_11

class User (
    val uniqueIdentifier: Int,
    val login: String,
    val password: String,
    val mail: String,
)
{
fun userData() {
    println("Данные пользователя: идентификационный номер: $uniqueIdentifier, логин: $login, " +
            "пароль: $password , мейл: $mail")
}
}

val user1 = User(123456, "kitis", "2G3K4L", "kitis32@mail.ru" )
val user2 = User(67892, "cova", "9H8K4M", "sova22@mail.ru")

fun main() {
    println(user1.userData())
    println(user2.userData())
}
