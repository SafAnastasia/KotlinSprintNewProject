package org.example.lesson_12

import kotlin.random.Random

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
    val monthlyTemperature = MutableListOf<WeatherDayNewTemp>

    for (i in 1..30)
        monthlyTemperature.add(WeatherDayNewTemp(daytimeTempK = Random.nextInt(283, 308),
            nightTempK = Random.nextInt(278, 308),
            precipitationDay = Random.nextBoolean())
        )
}

val daytimeTemps = monthlyTemperature.map {it.daytimeTemp}
val nightTemps = monthlyTemperature.map {it.nightTemp}

val aveDaytimeTemps = daytimeTemps.average()
val aveNightTemps  = nightTemps.average()

val precipitationDay = monthlyTemperature.count {it.precipitationDay}

println("Погода за месяц: ")
println("Средняя дневная температура: $aveDaytimeTemps")
println("Средняя ночная температура: $aveNightTemps")
println("Количество дней с осадками: $precipitationDay")


