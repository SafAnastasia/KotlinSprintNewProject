package org.example.lesson_14

class CargoShip(
    speed: Int = 20,
    capacity: Int = 5000,

) : Liner (speed, capacity){

    override fun info() {
        println("Грузовое судно: скорость: $speed, количество пассажиров: $capacity")
    }

}