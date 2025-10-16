package org.example.lesson_18

abstract class Dice(private val sides: Int) {
    fun roll() {
        val result: Int = (1..sides).random()
        println("Выпало число на D$sides: $result")
    }
}

class Dice4 : Dice(4)
class Dice6 : Dice(6)
class Dice8 : Dice(8)

fun main() {
    val diceList = listOf(Dice4(), Dice6(), Dice8())

    println("Бросаем кости")
    for (dice in diceList) {
        dice.roll()
    }
}
