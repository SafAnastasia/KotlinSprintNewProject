package org.example.lesson_20

class Robot {
    private val phrases = listOf(
        "Привет",
        "Как дела?",
        "Как настроение?",
        "Какой твой любимый цвет?",
        "Пока"
    )
    private var modifier: (String) -> String = { it }

    fun setModifier(mod: (String) -> String) {
        modifier = mod
    }

    fun say() {

        val index = phrases.indices.random()
        val phrase = phrases[index]
        val modifiedPhrase = modifier(phrase)
        println(modifiedPhrase)
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { sentence ->
        sentence.split(" ")
            .map { it.reversed() }
            .joinToString(" ")
    }
    robot.say()
}
