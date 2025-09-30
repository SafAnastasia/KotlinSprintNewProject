package org.example.lesson_20

val newYearGreeting: (String) -> String = {username: String -> "С наступающим Новым годом, $username!"}

fun main() {
    val userName = "Егор"
    println(newYearGreeting(userName))
}