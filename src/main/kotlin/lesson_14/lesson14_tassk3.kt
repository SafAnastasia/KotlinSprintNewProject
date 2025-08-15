package org.example.lesson_14

import kotlin.math.PI

abstract class Figure(
    val color: String
) {
    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double
) : Figure(color) {
    override fun calculateArea(): Double {
        return PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return PI * 3.14 * radius
    }
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double
) : Figure(color) {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {
    val figure = listOf(
        Circle(Black, 4.0),
        Circle(White, 3.0),
        Rectangle(Black, 4.0, 6.0),
        Rectangle(White, 4.0, 3.0)
    )
    val blackPerimeterSum = figure
        .filter { it.color == Black }
        .sumOf { it.calculatePerimeter() }

    val whiteAreaSum = figure
        .filter { it.color == White }
        .sumOf { it.calculateArea() }

    println("Сумма периметров всех черных фигур: %.2f".format(blackPerimeterSum))
    println("Сумма площадей всех белых фигур: %.2f".format(whiteAreaSum))
}

const val Black = "Black"
const val White = "White"
