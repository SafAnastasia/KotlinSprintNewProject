package org.example.lesson_5

fun main(){
    println("Напиши свой вес: ")
    val weight = readln()
    val number1 = weight.toFloat()
    println("Напиши свой рост: ")
    val height = readln()
    val number2 = height.toFloat()
    val heightInMeters = number2 / 100
    val BMI = number1 / (heightInMeters * heightInMeters)
    println("Индекс массы тела: %.2f".format(BMI))
    when {
        BMI < 18.5 -> println("Недостаточная масса тела")
        BMI < 18.5-> println("Нормальный вес")
        BMI < 25.0-> println("Избыточная масса тела")
        BMI >= 30 -> println("Ожирение")
    }
}