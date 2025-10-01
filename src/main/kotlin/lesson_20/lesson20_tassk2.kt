package org.example.lesson_20

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)

val healPotion: (Player) -> Unit = { player: Player -> player.currentHealth = player.maxHealth }

fun main() {
    val player = Player("Игрок", 50, 80)
    println("Уровень здоровья до использования зелья: ${player.currentHealth}")
    healPotion(player)
    println("Уровень здоровья после использования зелья: ${player.maxHealth}")
}