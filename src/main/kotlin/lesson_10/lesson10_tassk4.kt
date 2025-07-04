package org.example.lesson_10

fun main() {
    var userWins = 0
    while (true) {
        val didUserWin = round()
        if (didUserWin) userWins++
        println("Хотите бросить кости еще раз? Введите Да или Нет:")
        val answer = readln().lowercase()
        if (answer != "да") {
            break
        }
    }
    println("Игра окончена. Вы выиграли $userWins партий.")
}

fun round(): Boolean {
    println("Ход игрока")
    val manThrow = throwDice()
    println("Игрок выбросил: $manThrow")

    println("Ход компьютера")
    val computerThrow = throwDice()
    println("Компьютер выбросил: $computerThrow")

    return when {
        manThrow == computerThrow -> {
            println("Победила дружба")
            false
        }

        manThrow > computerThrow -> {
            println("Победило человечество")
            true
        }

        else -> {
            println("Победила машина")
            false
        }
    }
}
fun throwDice(): Int {
    return (1..6).random()
}




