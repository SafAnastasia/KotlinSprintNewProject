package org.example.lesson_14

open class Liner(
    open val name: String,
    open val speed: Int = 30,
    open val passengerCapacity: Int = 100,
    open val cargoCapacity: Int = 1000
) {
    open fun info() {
        println("Лайнер: скорость: $speed,\n количество пассажиров: ${passengerCapacity},\n вместимость грузов: $cargoCapacity")
    }
}

class CargoShip(
    override val name: String,
) : Liner(name, speed = 20, passengerCapacity = 100, cargoCapacity = 2000) {

    override fun info() {
        println("Грузовое судно: скорость: $speed,\n количество пассажиров: $passengerCapacity,\n вместимость грузов: $cargoCapacity")
    }

}

class Icebreaker(
    override val name: String,
) : Liner(name, speed = 15, passengerCapacity = 50, cargoCapacity = 1000) {
    override fun info() {
        println("Ледокол: скорость: $speed,\n количество пассажиров: $passengerCapacity,\n вместимость грузов: $cargoCapacity")
    }

    fun crushIce() {
        println("Колет лед")
    }
}

fun main() {
    val liner = Liner("Anna")
    val cargoShip = CargoShip("Ship")
    val iceBreaker = Icebreaker("Ice")

    liner.info()
    cargoShip.info()
    iceBreaker.crushIce()
    iceBreaker.info()
}