package org.example.lesson_17

class Parcel(val trackingNumber: Int, initialLocation: String) {

    var movementCount: Int = 0
        private set

    var location: String = initialLocation
        set(value) {
            field = value
            movementCount++
        }

    fun info() {
        println("Посылка № $trackingNumber находится сейчас в $location")
        println("Количество ее перемещений: $movementCount")
    }
}

fun main() {
    val parcel = Parcel(125689, "Владимир")

    println("Исходные данные:")
    parcel.info()
    println("Перемещение посылки:")
    parcel.location = "Владивосток"
    parcel.info()
}