package org.example.lesson_5

const val KILOMETERS = 100

fun main(){
    println("Расстояние поездки: ")
    val travelDistance = readln().toFloat()
    println("Расход топлива: ")
    val fuelConsumption = readln().toFloat()
    println("Текущая цена топлива: ")
    val fuelPrice = readln().toFloat()
    val fuel = travelDistance * fuelConsumption/ KILOMETERS
    val price = fuel * fuelPrice
    println("Общее количество необходимого топлива: %.2f".format(fuel))
    println("Итоговая стоимость поездки: %.2f".format(price))
}