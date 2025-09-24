package org.example.lesson_19

enum class FishType (val nameFish: String){
    GUPPY("Гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок")
}

fun main() {
    println("Вы можете добавить этих рыб в акквариум: ")
    FishType.values().forEach { fish ->
        println("${fish.nameFish}")
    }
}