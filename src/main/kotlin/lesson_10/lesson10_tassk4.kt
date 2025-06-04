package org.example.lesson_10

fun main() {
    var userWins = 0

    while (true) {
        val didUserWin = round()
        if (didUserWin) userWins++

        println("Хотите бросить кости еще раз? Введите Да или Нет:")
        val answer = readln()

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
        return (1..6).random()
    }




