package org.example.lesson_16

class Cube {
    private val number: Int = (1..6).random()
    fun rollDice() {
        println("Выпало число: $number")
    }
}

fun main() {
    val cube = Cube()
    cube.rollDice()
}