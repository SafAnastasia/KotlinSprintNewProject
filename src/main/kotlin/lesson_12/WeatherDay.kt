package org.example.lesson_12

class WeatherDay () {
    var daytimeTemp: Int = 0
    var nightTemp: Int = 0
    var precipitationDay: Boolean = false

    fun printWeather(): {
        println("Дневная температура: $daytimeTemp")
        println("Ночная температура: $nightTemp")
        println("Наличие осадков: $precipitationDay")
    }
}

fun main(){
    val day1 = WeatherDay()
    day1.daytimeTemp = 37
    day1.nightTemp = 18
    day1.precipitationDay = true

    val day2 = WeatherDay()
    day2.daytimeTemp = 31
    day2.nightTemp = 12
    day2.precipitationDay = false

    println("Погода за первый день: ")
    day1.printWeather()

    println("Погода за второй день: ")
    day2.printWeather()
}