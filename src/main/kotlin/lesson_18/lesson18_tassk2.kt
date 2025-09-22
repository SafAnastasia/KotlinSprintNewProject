package org.example.lesson_18

interface Dice {
    fun roll()
}

class D4 : Dice {
    override fun roll() {
        val result: Int = (1..4).random()
        println("Выпало число: $result")
    }
}

class D6 : Dice {
    override fun roll() {
        val result: Int = (1..6).random()
        println("Выпало число: $result")
    }
}

class D8 : Dice {
    override fun roll() {
        val result: Int = (1..8).random()
        println("Выпало число: $result")
    }
}

fun main() {
    val dice1: Dice = D4()
    val dice2: Dice = D6()
    val dice3: Dice = D8()

    val diceList = listOf<Dice>(dice1, dice2, dice3)

    println("Бросаем кости")
    for (dice in diceList) {
        dice.roll()
    }
}
