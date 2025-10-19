package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distanceFromEarth: Double
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Ближайшая звездная система",
        dateTime = "Постоянно",
        distanceFromEarth = 6.8
    )
//toString()
    println("Полная информация")
    println(alphaCentauri)
    println()

//деструктуризация
    println("Использование компонентных функций")
    val (name, description, dateTime, distance) = alphaCentauri
    println("Название: $name")
    println("Описание: $description")
    println("Временной статус: $dateTime")
    println("Расстояние от Земли: ${distance} световых лет")
    println()

// доступ к отдельным свойствам
    println("Доступ к отдельным свойствам")
    println("Система: ${alphaCentauri.name}")
    println("Находится в: ${alphaCentauri.distanceFromEarth} световых годах от Земли")
    println("Особенности: ${alphaCentauri.description}")
    println()

//использование по индексу
    println("Функции по индексу")
    println("Компонент 1 (name): ${alphaCentauri.component1()}")
    println("Компонент 2 (description): ${alphaCentauri.component2()}")
    println("Компонент 3 (dateTime): ${alphaCentauri.component3()}")
    println("Компонент 4 (distance): ${alphaCentauri.component4()}")

}
