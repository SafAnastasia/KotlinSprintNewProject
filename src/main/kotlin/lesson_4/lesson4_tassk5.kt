package org.example.lesson_4

const val MINIMUM_CREW_SIZE = 55
const val MAXIMUM_NUMBER_CREW = 70
const val NUMBER_PROVISIONS = 50
const val WEATHER_CONDITIONS = true

fun main() {
    println("Есть ли повреждения корпуса?")
    val shipDamage = readln().toBoolean()
    println("Введите текущий состав экипажа")
    val currentCrewComposition = readln().toInt()
    println("Введите количество ящиков с провизией")
    val boxesProvisions = readln().toInt()
    println("Погода благоприятная?")
    val favorableWeather = readln().toBoolean()

    val sailingConditions =
        (!shipDamage && currentCrewComposition in MINIMUM_CREW_SIZE..MAXIMUM_NUMBER_CREW && boxesProvisions >= NUMBER_PROVISIONS) ||
        (shipDamage && currentCrewComposition == MAXIMUM_NUMBER_CREW && favorableWeather == WEATHER_CONDITIONS && boxesProvisions >= NUMBER_PROVISIONS)

    if (sailingConditions) {
        println("Корабль может отправиться в плавание")
    } else {
        println("Корабль не может отправиться в плавание")
    }
}