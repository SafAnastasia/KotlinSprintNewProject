package org.example.lesson_6

fun main(){
    println("Сколько секунд нужно засечь? ")
    var second = readln().toInt()
    while (second > 0){
        println("Осталось: $second секунд" )
        Thread.sleep(1000)
        second--
    }
    println("Прошло $second секунд")
}