package org.example.lesson_16

class Player(val name: String, private var health: Int, private var impactForce: Int) {

    private var isDead: Boolean = false
    fun takingDamage(damage: Int) {
        if (isDead) {
            println("Игрок $name мертв и не может получать урон")
            return
        }

        println("$name получает урон $damage")
        health -= damage
        if (health <= 0) {
            die()
        } else {
            println("у игрока $name осталость $health здоровья")
        }
    }

    fun heal(amount: Int) {
        if (isDead) {
            println("Игрок мертв")
            return
        }
        health += amount
        println("Игрок $name лечится $amount. Теперь его здоровье: $health")

    }

    private fun die() {
        health = 0
        impactForce = 0
        isDead = true
        println("Игрок $name умер")

    }

    fun playerInfo() {
        println("Игрок с именем: $, уровнем здоровья: $health, и силой удара: $impactForce, мертв: $isDead")
    }
}

fun main() {
    val player = Player("Alex", 100, 10)
    player.playerInfo()

    player.takingDamage(20)
    player.heal(10)
    player.takingDamage(100)
    player.heal(50)
}
