package org.example.lesson_14

import java.io.Writer

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
        return 3.14 * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * 3.14 * radius
    }
}

class Rectangle(
    color: String,
    val weight: Double,
    val height: Double
) : Figure(color) {
    override fun calculateArea(): Double {
        return weight * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (weight + height)
    }
}

fun main() {
    val figure = listOf(
        Circle("Black", 4.0),
        Circle("White", 3.0),
        Rectangle("Black", 4.0, 6.0),
        Rectangle("White", 4.0, 3.0)
    )
    val BlacPerimeterSum = figure
        .filter { it.color == "Black" }
        .sumOf { it.calculatePerimeter() }

    val WhiteAreaSum = figure
        .filter { it.color == "White" }
        .sumOf { it.calculateArea() }

    println("Сумма периметров всех черных фигур: %.2f".format(BlacPerimeterSum))
    println("Сумма площадей всех белых фигур: %.2f".format(WhiteAreaSum))
}

