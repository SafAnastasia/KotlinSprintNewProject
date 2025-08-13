package org.example.lesson_14

open class NewLiner(
    open val name: String,
    open val speed: Int = 30,
    open val passengerCapacity: Int = 100,
    open val cargoCapacity: Int = 1000
) {
    open fun printInfo() {
        println("Лайнер $name: скорость: $speed,\n количество пассажиров: ${passengerCapacity},\n вместимость грузов: $cargoCapacity")
    }

    fun pushTram() {
        println("Выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShip1(
    override val name: String,
) : NewLiner(name, speed = 20, passengerCapacity = 100, cargoCapacity = 2000) {

    override fun printInfo() {
        println("Грузовое судно: скорость: $speed,\n количество пассажиров: $passengerCapacity,\n вместимость грузов: $cargoCapacity")
    }

    fun activateFaucet() {
        println("Активирует погрузочный кран")
    }
}

class Icebreaker1(
    override val name: String,
) : NewLiner(name, speed = 15, passengerCapacity = 50, cargoCapacity = 1000) {
    override fun printInfo() {
        println("Ледокол: скорость: $speed,\n количество пассажиров: $passengerCapacity,\n вместимость грузов: $cargoCapacity")
    }

    fun openGate() {
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

    liner.printInfo()
    cargoShip.printInfo()
    iceBreaker.crushIce()
    iceBreaker.printInfo()
    liner.pushTram()
    cargoShip.activateFaucet()
    iceBreaker.openGate()
}
