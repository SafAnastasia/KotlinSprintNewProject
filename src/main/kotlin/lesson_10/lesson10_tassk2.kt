package org.example.lesson_10

fun main() {
    println("Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()

    if (dataLength(login) && dataLength(password)) {
        println("Добро пожаловать")
        }else {
        println("Логин или пароль недостаточно длинные")
    }

}

fun dataLength(input: String): Boolean {
    return input.length >= 4
}