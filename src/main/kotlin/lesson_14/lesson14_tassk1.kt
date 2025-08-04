package org.example.lesson_14

open class Liner(
    open val name: String,
    open val speed: Int,
    open val pasСapacity: Int,
    open val cargoСapacity: Int
) {
    open fun info() {
        println("Лайнер: скорость: $speed,\n количество пассажиров: $pasСapacity,\n вместимость грузов: $cargoСapacity")
    }
}

class CargoShip(
    override val name: String,
    override val speed: Int,
    override val pasСapacity: Int,
    override val cargoСapacity: Int
) : Liner(name, speed, pasСapacity, cargoСapacity) {

    override fun info() {
        println("Грузовое судно: скорость: $speed,\n количество пассажиров: $pasСapacity,\n вместимость грузов: $cargoСapacity")
    }

}

class Icebreaker(
    override val name: String,
    override val speed: Int,
    override val pasСapacity: Int,
    override val cargoСapacity: Int
) : Liner(name, speed, pasСapacity, cargoСapacity) {
    override fun info() {
        println("Ледокол: скорость: $speed,\n количество пассажиров: $pasСapacity,\n вместимость грузов: $cargoСapacity")
    }

    fun crushIce() {
        println("Колет лед")
    }
}

fun main() {
    val liner = Liner("Anna", 30, 100, 1000)
    val cargoShip = CargoShip("Ship", 20, 100, 2000)
    val iceBreaker = Icebreaker("Ice", 15, 50, 1000)

    liner.info()
    cargoShip.info()
    iceBreaker.crushIce()
    iceBreaker.info()
}