package org.example.lesson_6

fun main(){
    println("Сколько секунд нужно засечь? ")
    var second = readln().toInt()
    println("Осталось: $second секунд" )
    Thread.sleep(second *1000L)
    println("Прошло $second секунд")
}