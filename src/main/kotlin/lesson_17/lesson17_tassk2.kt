package org.example.lesson_17

class Ship ( private var name: String, var averageSpeed: Double, var homePort: Int) {
    var name: String
        get() = name
        set(value) {
            println("Имя коробря изменить нельзя")

        }
    fun infoShip() {
        println("Коробль: $name, скорость корабля: $averageSpeed, порт приписки: $homePort")

    }
}

fun main() {
    val ship = Ship("Александра", 600, "Владивосток")
    ship.infoShip()
    ship.name = "Аврора"

    ship.averageSpeed = 234
    ship.homePort = "Санкт-Петербург"
}
