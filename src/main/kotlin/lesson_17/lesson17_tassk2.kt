package org.example.lesson_17

class Ship(name: String, var averageSpeed: Double, var homePort: String) {
    var name: String = name
        set(value) = println("Имя коробря изменить нельзя")

    fun infoShip() {
        println("Коробль: $name, скорость корабля: $averageSpeed, порт приписки: $homePort")
    }
}

fun main() {
    val ship = Ship("Александра", 600.0, "Владивосток")
    ship.infoShip()
    ship.name = "Аврора"

    ship.averageSpeed = 234.0
    ship.homePort = "Санкт-Петербург"
}
