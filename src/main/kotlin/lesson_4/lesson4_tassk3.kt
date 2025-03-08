package org.example.lesson_4

const val HUMIDITY = 20
const val SEASON = "зима"
const val IS_SUNNY = true
const val TENT_OPEN = true

fun main() {
    val favorableConditions = IS_SUNNY && TENT_OPEN && HUMIDITY == 20 && SEASON != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}
