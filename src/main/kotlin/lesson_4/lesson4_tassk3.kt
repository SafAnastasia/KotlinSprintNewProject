package org.example.lesson_4

const val HUMIDITY = 20
const val SEASON = "зима"

fun main() {
    val isSunny: Boolean = true
    val tentOpen: Boolean = true
    val favorableConditions = isSunny && tentOpen && HUMIDITY == 20 && SEASON != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}
