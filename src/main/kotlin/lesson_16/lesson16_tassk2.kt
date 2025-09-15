package org.example.lesson_16

class Circle(private val radius: Double) {
    private companion object {
        const val PI = 3.14
    }

    fun circumference(): Double {
        return 2 * PI * radius
    }

    fun areaCircle(): Double {
        return PI * radius * radius
    }
}

fun main() {
    val circle = Circle(5.0)
    println("Длина окружности: ${circle.circumference()}")
    println("Площадь круга: ${circle.areaCircle()}")
}