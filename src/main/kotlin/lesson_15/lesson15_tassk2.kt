package org.example.lesson_15

abstract class WeatherStationStats {
    abstract val unit: String
    abstract val value: Double
    abstract fun getInfo(): String
}

class Temperature(override val value: Double) : WeatherStationStats() {
    override val unit: String = "С"
    override fun getInfo(): String = "Температура: $unit, $value "
}

class PrecipitationAmount(override val value: Double) : WeatherStationStats() {
    override val unit: String = "мм"
    override fun getInfo(): String = "Количество осадков: $unit, $value"
}

class WeatherServer() {
    fun sendMessage(stats: WeatherStationStats) {
        println("Отправка данных на сервер: ${stats.getInfo()}")
    }
}

fun main() {
    val temperature1 = Temperature(33.5)
    val precipitation1 = PrecipitationAmount(10.2)

    val server = WeatherServer()
    server.sendMessage(temperature1)
    server.sendMessage(precipitation1)
}