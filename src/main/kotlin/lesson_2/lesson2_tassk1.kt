package org.example.lesson_2
const val QUANTITY = 4
fun main() {
    val schBoy1: Int = 3
    val schBoy2: Int = 4
    val schBoy3: Int = 3
    val schBoy4: Int = 5
    val arithmeticMean = (schBoy1 + schBoy2 + schBoy3 + schBoy4) / QUANTITY.toDouble()
    println("%.2f".format(arithmeticMean))
}