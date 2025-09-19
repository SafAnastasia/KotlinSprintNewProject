package org.example.lesson_17

class QuizElement(
    question: String,
    answer: String
) {
    var question: String = question
        get() = field
        
    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}