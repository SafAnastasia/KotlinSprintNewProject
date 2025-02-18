package org.example.lesson_2
const val MINUTES = 60
fun main() {
    val specifiedMinutes = 39
    val hour = 9
    val checkOutTime = (hour * MINUTES) + specifiedMinutes
    val travelTime: Int = 457
    val arrivalTime = (travelTime + checkOutTime) / MINUTES.toDouble()
    println("%.2f".format(arrivalTime))

}