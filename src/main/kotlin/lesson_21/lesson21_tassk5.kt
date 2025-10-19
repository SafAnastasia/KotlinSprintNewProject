package org.example.lesson_21

fun Map<String, Int>.maxCategory(): String {
    return this.maxByOrNull { it.value }?.key ?: "Нет навыков"
}

fun main() {
    val playerSkills = mapOf(
        "Сила" to 150,
        "Ловкость" to 100,
        "Интеллект" to 200,
        "Магия" to 80
    )
    println("Все навыки: $playerSkills")
    println("Масимальный навык: ${playerSkills.maxCategory()}")
}