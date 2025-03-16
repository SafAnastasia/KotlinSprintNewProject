package org.example.lesson_6

fun main() {
    println("Пройдите регистрацию")
    println("Создайте логин: ")
    val login = readln()
    println("Создайте пароль: ")
    val password = readln()

    while (true) {
        println("Введите логин: ")
        val login1 = readln()
        println("Введите пароль: ")
        val password1 = readln()

        if (login == login1 && password == password1) {
            println("Авторизация прошла успешно")
        } else {
            println("Ошибка! Неверный логин или пароль. Попробуйте снова.")
        }
    }
}
