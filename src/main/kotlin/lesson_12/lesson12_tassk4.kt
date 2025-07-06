package org.example.lesson_12

class WeatherDayNewTemp (daytimeTempK: Int, nightTempK: Int, precipitationDay: Boolean) {
    val daytimeTemp: Int
    val nightTemp: Int
    val precipitationDay: Boolean

    init {
        daytimeTemp = daytimeTempK - 273
        nightTemp = nightTempK - 273
        this.precipitationDay = precipitationDay

        println("Дневная температура: $daytimeTemp")
        println("Ночная температура: $nightTemp")
        println("Наличие осадков: $precipitationDay")
    }
}

fun main() {
    val day = WeatherDayNewTemp(298, 288, false)
    println("Погода за день: ")
}