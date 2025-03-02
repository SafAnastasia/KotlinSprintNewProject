package org.example.lesson_4

const val MINIMUM_WEIGHT = 35
const val WEIGHT_LIMIT = 100
const val VOLUME = 100

fun main() {
    var setWeight = 20
    var specifiedVolume = 80
    val weight = (setWeight > MINIMUM_WEIGHT) && (setWeight <= WEIGHT_LIMIT) && (specifiedVolume < VOLUME)
    println("Груз с весом $setWeight кг и объемом $specifiedVolume л соответствует категории 'Average': $weight")
    setWeight = 50
    specifiedVolume = 100
    println("Груз с весом $setWeight кг и объемом $specifiedVolume л соотвествует категории 'Average': $weight")

}
