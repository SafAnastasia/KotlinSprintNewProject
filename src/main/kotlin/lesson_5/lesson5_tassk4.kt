package org.example.lesson_5

const val USER_NAME = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {
    println("Введите имя пользователя: ")
    val name = readln()
    if (name == USER_NAME) {
        println("Введите пароль: ")
        val passwordUser = readln()
        if (passwordUser == PASSWORD) {
            println("Пользователь $USER_NAME, вам разрешено входить на борт корабля Heart of Gold.")
        } else {
            println("Пароль не верный")
        }
    } else {
        println("Зарегистрируйтесь, пожалуйста")
        println("Программа завершена")
    }
}