package org.example.lesson_16

import kotlin.random.Random

class Cube {
    private val number: Int = Random.nextInt(1, 7)
    fun findNumber() {
        println("Выпало число: $number")
    }
}

fun main() {
    val cube = Cube()
    cube.findNumber()
}