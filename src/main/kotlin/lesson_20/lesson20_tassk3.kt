package org.example.lesson_20

class Player(val name: String, var hasKey: Boolean)

val keyDoor: (Player) -> String = { player: Player ->
    if (player.hasKey) "Игрок открыл дверь" else "Дверь заперта, если ключа нет"
}

fun main() {
    val player = Player("Игрок", true)
    println("Игрок ${player.name}: ${keyDoor(player)}")
}