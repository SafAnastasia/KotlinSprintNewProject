package org.example.lesson_2

fun main() {
    val checkOutTime = (9 * 60) + 39
    val travelTime: Int = 457
    val arrivalTime = (travelTime + checkOutTime) / 60.0
    println(arrivalTime)

}