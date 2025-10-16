package org.example.lesson_17

class User {
    var login: String = ""
        set(value) {
            field = value
            println("Логин изменен")
        }
    var password: String = ""
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")

        }
}

fun main() {
    val user = User().apply {
        login = "ann22"
        password = "pass1234"
    }
    println("Логин:${user.login}")
    println("Пароль:${user.password}")
    println()

    println("Изменение логина")
    user.login = "sky33"
    println("Новый логин: ${user.login}")
    println()

    println("Изменение пароля")
    user.password = "pass6677"
    println("Пароль после попытки его изменить: ${user.password}")
}