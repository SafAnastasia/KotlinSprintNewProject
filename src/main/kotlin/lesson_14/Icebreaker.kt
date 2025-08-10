package org.example.lesson_14

class Icebreaker(
    speed: Int = 15,
    capacity: Int = 200,
) : Liner(speed, capacity) {
    fun crushIce() {
        println("Колет лед")
    }
}