package org.example.lesson_18

class Screen {
    fun drawCircle(x: Int, y: Int): String {
        return "Круг нарисован в целых координатах: x=$x, у=$y"
    }

    fun drawCircle(x: Float, y: Float): String {
        return "Круг нарисован в дробных координатах: х=$x, y=$y"
    }

    fun drawSquare(x: Int, y: Int): String {
        return "Квадрат нарисован в целых координатах: x=$x, y=$y"
    }

    fun drawSquare(x: Float, y: Float): String {
        return "Квадрат нарисован в дробных координатах: x=$x, y=$y"
    }

    fun drawPoint(x: Int, y: Int): String {
        return "Точка поставлена в целых координатах: x=$x, y=$y"
    }

    fun drawPoint(x: Float, y: Float): String {
        return "Точка поставлена в целых координатах: x=$x, y=$y"
    }
}

fun main() {
    val screen = Screen()
    println(screen.drawCircle(10, 20))
    println(screen.drawCircle(23.4f, 34.8f))
    println(screen.drawSquare(5, 15))
    println(screen.drawSquare(3.4f, 5.6f))
    println(screen.drawPoint(6, 7))
    println(screen.drawPoint(6.7f, 4.5f))

}