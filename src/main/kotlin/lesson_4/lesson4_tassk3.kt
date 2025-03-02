package org.example.lesson_4

fun main() {
    val sunnyWeather: Boolean = true
    val tentOpen: Boolean = true
    val humidity: Int = 20
    val season: String = "зима"

    val favorableConditions = sunnyWeather && tentOpen && humidity == 20 && season != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}
