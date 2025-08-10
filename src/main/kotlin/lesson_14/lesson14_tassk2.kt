package org.example.lesson_14

open class NewLiner(
    open val name: String,
    open val speed: Int = 30,
    open val passengerCapacity: Int = 100,
    open val cargoCapacity: Int = 1000
) {
    open fun info() {
        println("Лайнер $name: скорость: $speed,\n количество пассажиров: ${passengerCapacity},\n вместимость грузов: $cargoCapacity")
    }

    fun extendsRamp() {
        println("Выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShip1(
    override val name: String,
) : NewLiner(name, speed = 20, passengerCapacity = 100, cargoCapacity = 2000) {

    override fun info() {
        println("Грузовое судно: скорость: $speed,\n количество пассажиров: $passengerCapacity,\n вместимость грузов: $cargoCapacity")
    }

    fun activatesFaucet() {
        println("Активирует погрузочный кран")
    }
}

class Icebreaker1(
    override val name: String,
) : NewLiner(name, speed = 15, passengerCapacity = 50, cargoCapacity = 1000) {
    override fun info() {
        println("Ледокол: скорость: $speed,\n количество пассажиров: $passengerCapacity,\n вместимость грузов: $cargoCapacity")
    }

    fun opensGate() {
        println("Открывает ворота со стороны кормы")
    }

    fun crushIce() {
        println("Колет лед")
    }
}

    fun main() {
        val liner = NewLiner("Anna")
        val cargoShip = CargoShip1("Ship")
        val iceBreaker = Icebreaker1("Ice")

        liner.info()
        cargoShip.info()
        iceBreaker.crushIce()
        iceBreaker.info()
        liner.extendsRamp()
        cargoShip.activatesFaucet()
        iceBreaker.opensGate()
    }
