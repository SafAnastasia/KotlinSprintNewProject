package org.example.lesson_15

abstract class Product(val name: String, var quantity: Int) {
    open fun getInfo(): String {
        return "Товар: $name, Количество на складе: $quantity"
    }
}

interface ComponentSearchable {
    fun searchComponents(): String
}

class Instrument(name: String, quantity: Int, val compatibleComponents: List<String>) : Product(name, quantity),
    ComponentSearchable {
    override fun getInfo(): String {
        return "Интрумент: $name, количество: $quantity, комплектующие: $compatibleComponents"
    }

    override fun searchComponents(): String {
        return "Поиск комплектующих для $name"

    }
}

class Component(name: String, quantity: Int) : Product(name, quantity) {
    override fun getInfo(): String {
        return "Коплектующее: $name, количество: $quantity"
    }
}

fun main() {
    val violin = Instrument("Скрипка", 2, listOf("струны"))
    val guitar = Instrument("Гитара", 2, listOf("струны"))

    val guitarStrings = Component("струны для гитары", 4)
    val violinStrings = Component("струны для скрипки", 7)

    println(violin.getInfo())
    println(guitar.getInfo())
    println(guitarStrings.getInfo())
    println(violinStrings.getInfo())

    println(violin.searchComponents())
    println(guitar.searchComponents())
}