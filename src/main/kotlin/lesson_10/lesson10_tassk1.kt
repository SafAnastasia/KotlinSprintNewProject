package org.example.lesson_10

import kotlin.random.Random

fun main() {
    println("Ход игрока")
    val manThrow = throwDice()
    println("Игрок выбросил: $manThrow")

    println("Ход компьютера")
    val computerThrow = throwDice()
    println("Компьютер выбросил: $computerThrow")

    if (manThrow == computerThrow) {
        println("Победила дружба")
    }
    if (manThrow > computerThrow) {
        println("Победило человечество")
    } else {
        println("Победила машина")
    }
}

fun throwDice(): Int {
    return Random.nextInt(1,7)
}

