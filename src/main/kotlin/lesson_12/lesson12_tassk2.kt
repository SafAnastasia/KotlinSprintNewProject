package org.example.lesson_12

class WeatherDayNew (daytimeTemp: Int, nightTemp: Int, precipitationDay: Boolean) {
    val daytimeTemp: Int = daytimeTemp
    val nightTemp: Int = nightTemp
    val precipitationDay: Boolean = precipitationDay

    fun printWeather() {
        println("Дневная температура: $daytimeTemp")
        println("Ночная температура: $nightTemp")
        println("Наличие осадков: $precipitationDay")
    }
}

fun main() {
    val day = WeatherDayNew(28, 15, false)
    println("Погода за день: ")
    day.printWeather()
}