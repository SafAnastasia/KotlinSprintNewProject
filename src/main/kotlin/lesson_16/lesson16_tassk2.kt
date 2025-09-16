package org.example.lesson_16

import kotlin.math.pow

class Circle(private val radius: Double) {
    private companion object {
        const val PI = 3.14
    }

    fun getCircumference(): Double {
        return 2 * PI * radius
    }

    fun areaCircle(): Double {
        return PI * radius.pow(2)
    }
}

fun main() {
    val circle = Circle(5.0)
    println("Длина окружности: ${circle.getCircumference()}")
    println("Площадь круга: ${circle.areaCircle()}")
}