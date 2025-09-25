package org.example.lesson_18

abstract class Animal(val name: String) {
    abstract fun eat()
    fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости ")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {
    val fox: Animal = Fox("Лиси")
    val dog: Animal = Dog("Коржик")
    val cat: Animal = Cat("Кот")

    val animals: List<Animal> = listOf(fox, dog, cat)

    for (animal in animals) {
        animal.eat()
    }
}