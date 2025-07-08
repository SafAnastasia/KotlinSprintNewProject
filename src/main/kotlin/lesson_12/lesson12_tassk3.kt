package org.example.lesson_12

class WeatherDayNewTemp (daytimeTempK: Int, nightTempK: Int, precipitationDay: Boolean) {
    val daytimeTemp = daytimeTempK - 273
    val nightTemp = nightTempK - 273
    val precipitationDay = precipitationDay

    fun printWeather() {
        println("Дневная температура: $daytimeTemp")
        println("Ночная температура: $nightTemp")
        println("Наличие осадков: $precipitationDay")
    }
}

fun main() {
    val day = WeatherDayNewTemp(298, 288, false)
    println("Погода за день: ")
    day.printWeather()
}