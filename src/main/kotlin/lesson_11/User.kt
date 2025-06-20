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


class User2 (
    val uniqueIdentifier: Int,
    val login: String,
    var password: String,
    val mail: String,
    val bio: String = " "
)
{
    fun userData() {
        println("Данные пользователя: идентификационный номер: $uniqueIdentifier, логин: $login, " +
                "пароль: $password , мейл: $mail, поле bio: $bio")

    }
    fun bioField() {
        println("Введите текст о себе: ")
        val fieldEntry = readln()
}
    fun changePassword() {
        println("Введите текущий пароль: ")
        val сurrentPassword = readln()
        if (сurrentPassword == password) {
            println("Введите новый пароль: ")
            val newPassword = readln()
            password = newPassword
            println("Пароль изменен: $newPassword")
        }
    }
}

fun main() {
    val user3 = User2(34567, "topol", "2L3G4K",
    "topol44@mail.ru")

    user3.bioField()
    user3.changePassword()
    user3.userData()
}


