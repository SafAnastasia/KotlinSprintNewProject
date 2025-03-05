package org.example.lesson_5

const val FIRST_NUMBER = 0
const val SECOND_NUMBER = 42

fun main(){
    println("Введите первое число: ")
    val number1 = readln().toInt()
    println("Введите второе число: ")
    val number2 = readln().toInt()
    if ((number1 == FIRST_NUMBER && number2 == SECOND_NUMBER) || (number1 == SECOND_NUMBER && number2 == FIRST_NUMBER))
    {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (number1 == FIRST_NUMBER  ||  number1 == SECOND_NUMBER)  {
        println("Вы выиграли утешительный приз!")
    } else if (number2 == FIRST_NUMBER  ||  number2 == SECOND_NUMBER)  {
        println("Вы выиграли утешительный приз!")
    }else {
        println("Неудача!")
    }

}