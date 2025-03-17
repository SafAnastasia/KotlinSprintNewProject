package org.example.lesson_4

const val HUMIDITY = 20
const val SEASON = "зима"
const val IS_SUNNY = true
const val TENT_OPEN = true

fun main() {
    val sunnyWeather = true
    val airWumidity = 20
    val currentSeason = "зима"
    val tentNow = true
    val favorableConditions = IS_SUNNY == sunnyWeather && TENT_OPEN == tentNow && HUMIDITY == airWumidity && SEASON != currentSeason

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}
