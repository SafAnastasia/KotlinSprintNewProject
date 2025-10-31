package org.example.lesson_17

class User(_login: String, _password: String) {
    var login: String = _login
        set(value) {
            field = value
            println("Логин изменен")
        }
    var password: String = _password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user = User("ann22", "pass1234")

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