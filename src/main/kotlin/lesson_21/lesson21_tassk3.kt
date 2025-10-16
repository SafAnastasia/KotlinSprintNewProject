package org.example.lesson_21

class NewPlayer(val name: String, var newCurrentHealth: Int, val newMaxHealth: Int)

fun NewPlayer.isHealthy(): Boolean {
    return newCurrentHealth == newMaxHealth
}

fun main() {
    val player1 = NewPlayer("Игрок", 60, 80)
    println(player1.isHealthy())
}