package org.example.lesson_4

fun main() {
    val minimumWeight = 35
    val weightLimit = 100
    val volume = 100
    var setWeight = 20
    var specifiedVolume = 80
    var Weight1 = (setWeight > minimumWeight) && (setWeight <= weightLimit) && (specifiedVolume < volume)
    println("Груз с весом $setWeight кг и объемом $specifiedVolume л соответствует категории 'Average': $Weight1")
    setWeight = 50
    specifiedVolume = 100
    println("Груз с весом $setWeight кг и объемом $specifiedVolume л соотвествует категории 'Average': $Weight1")

}
