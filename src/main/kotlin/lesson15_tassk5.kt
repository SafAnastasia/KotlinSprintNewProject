package org.example

interface Movable {
    fun move(distance: Double): String
}

interface TransportationOfPassengers {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(count: Int): String
    fun unloadPassengers(count: Int): String
}

interface Shipping {
    val maxLoad: Double
    var currentLoad: Double

    fun cargoLoad(amount: Double): String
    fun unloadCargo(amount: Double): String

}

class Truck : Movable, TransportationOfPassengers, Shipping {
    override val maxPassengers = 1
    override var currentPassengers = 0

    override val maxLoad = 2.0
    override var currentLoad = 0.0

    override fun move(distance: Double): String {
        return "Грузовая машина проехала $distance км с $currentPassengers пассажирами и $currentLoad тонн груза"
    }

    override fun loadPassengers(count: Int): String {
        if (currentPassengers + count > maxPassengers) {
            return "Превышено количество пассажиров"
        }
        currentPassengers += count
        return "Загружено $count пассажиров"
    }

    override fun unloadPassengers(count: Int): String {
        currentPassengers -= count
        return "Выгружено $count пассажиров"
    }

    override fun cargoLoad(amount: Double): String {
        if (currentLoad + amount > maxLoad) {
            return "Нельзя загрузить, превышен лимит груза"
        }
        currentLoad += amount
        return "Загружено $amount тонн"
    }

    override fun unloadCargo(amount: Double): String {
        if (currentLoad - amount < 0) {
            return "Нельзя выгрузить больше, чем есть груза"
        }
        currentLoad -= amount
        return "Выгружено $amount тонн"
    }
}

class Car : Movable, TransportationOfPassengers {
    override val maxPassengers = 3
    override var currentPassengers = 0

    override fun move(distance: Double): String {
        return "Легковая машина проехала $distance км с $currentPassengers пассажирами"
    }

    override fun loadPassengers(count: Int): String {
        if (currentPassengers + count > maxPassengers) {
            return "Превышенно количество пассажиров"
        }
        currentPassengers += count
        return "Загруженое количество пассажиров $count"
    }

    override fun unloadPassengers(count: Int): String {
        currentPassengers -= count
        return "Выгруженое количество пассажиров $count"
    }

}

fun main() {
    val truck = Truck()
    val car1 = Car()
    val car2 = Car()

    //Загружаем пассажиров
    println(truck.loadPassengers(1))
    println(car1.loadPassengers(3))
    println(car2.loadPassengers(2))
    //Загружаем груз
    println(truck.cargoLoad(2.0))
    //Перевозим
    println(car1.move(10.0))
    println(car2.move(10.0))
    println(truck.move(10.0))
    //Выгружаем
    println(truck.unloadPassengers(1))
    println(car1.unloadPassengers(3))
    println(car2.unloadPassengers(2))
    println(truck.unloadCargo(2.0))
}

