package org.example.lesson_14

open class Liner(
    val speed: Int = 30,
    val capacity: Int = 1000,
) {
    open fun info() {
        println("Лайнер: скорость: $speed, количество пассажиров: $capacity")
    }
}