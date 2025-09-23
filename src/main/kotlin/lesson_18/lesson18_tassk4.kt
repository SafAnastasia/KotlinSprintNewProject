package org.example.lesson_18

abstract class Box {
    abstract fun surfaceArea(): Double
}

class rectangularBox(
    val length: Double,
    val width: Double,
    val height: Double
) : Box() {
    override fun surfaceArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}

class cubicBox(
    val ribLength: Double
) : Box() {
    override fun surfaceArea(): Double {
        return 6 * ribLength * ribLength
    }
}

fun main() {
    val box1: Box = rectangularBox(10.0, 7.0, 3.0)
    val box2: Box = cubicBox(3.0)

    println("Площадь поверхности прямоугольной посылки: ${box1.surfaceArea()}")
    println("Площадь поверхности кубической посылки: ${box2.surfaceArea()}")
}