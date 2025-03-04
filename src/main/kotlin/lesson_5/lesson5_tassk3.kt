package org.example.lesson_5

const val FIRST_NUMBER = 0
const val SECOND_NUMBER = 42

fun main(){
    println("Введите число: ")
    val givenNumbers = readln().toInt()
    if (givenNumbers == FIRST_NUMBER && givenNumbers == SECOND_NUMBER) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (givenNumbers == FIRST_NUMBER  || givenNumbers == SECOND_NUMBER) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

}