package org.example.lesson_5

fun main(){
    println("Напишите сумму чисел?")
    val numbers = readln()!!.split(" ").map{ it.toInt()}
    var number1 = 2
    var number2 = 2
    val sum = number1 + number2
    if (numbers == sum){
        println("Добро пожаловать!")
    } else
        println("Доступ запрещен")
}