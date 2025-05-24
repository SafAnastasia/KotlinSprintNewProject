package org.example.lesson_4

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
        (!shipDamage && currentCrewComposition in 55..70 && boxesProvisions >= 50) || (shipDamage && currentCrewComposition == 70 && favorableWeather == true && boxesProvisions >= 50)

    if (sailingConditions) {
        println("Корабль может отправиться в плавание")
    } else {
        println("Корабль не может отправиться в плавание")
    }
}