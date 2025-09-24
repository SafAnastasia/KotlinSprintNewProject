package org.example.lesson_18

abstract class Box {
    abstract fun getSurfaceArea(): Double
}

class RectangularBox(
    private val length: Double,
    private val width: Double,
    private val height: Double
) : Box() {
    override fun getSurfaceArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}

class CubicBox(
    val ribLength: Double
) : Box() {
    override fun getSurfaceArea(): Double {
        return 6 * ribLength * ribLength
    }
}

fun main() {
    val box1: Box = RectangularBox(10.0, 7.0, 3.0)
    val box2: Box = CubicBox(3.0)

    println("Площадь поверхности прямоугольной посылки: ${box1.getSurfaceArea()}")
    println("Площадь поверхности кубической посылки: ${box2.getSurfaceArea()}")
}