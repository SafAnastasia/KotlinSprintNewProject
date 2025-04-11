package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val summaUser = 70_000.0
    val interestRate = 16.7
    val year = 20
    val depositAmount = summaUser * (1 + (interestRate / 100)).pow(year)
    println("Размер вклада через $year лет: %.3f ₽".format(depositAmount))
}