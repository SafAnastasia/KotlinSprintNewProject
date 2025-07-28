package org.example.lesson_14

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()

    liner.info()
    cargoShip.info()
    icebreaker.crushIce()
    icebreaker.info()
}