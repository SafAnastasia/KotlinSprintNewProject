package org.example.lesson_17

class QuizElement(
    question: String,
    answer: String
) {
    val question: String = question
        get() {
            println("Воспрос")
            return field
        }
    var answer: String = answer
        get() {
            println("Ответ")
            return field

        }
        set(value) {
            println("Новый ответ")
            field = value
        }

}