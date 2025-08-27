package org.example.lesson_15

interface FlyingCreature {
    fun fly(): String
}

interface SwimmingCreatures {
    fun swim(): String
}

class CrucianCarp: SwimmingCreatures {
    override fun swim(): String {
        return ("Карась плавает")
    }
}

class Gull: FlyingCreature {
    override fun fly(): String {
        return ("Чайка летает")
    }
}

class Duck: FlyingCreature, SwimmingCreatures {
    override fun swim(): String {
        return ("Утка умеет плавать вод водой")
    }

    override fun fly(): String {
        return ("Утка умеет летать не высоко над водой")
    }
}

fun main(){
    val carp = CrucianCarp()
    val gull = Gull()
    val duck = Duck()

    println(carp.swim())
    println(gull.fly())
    println(duck.swim())
    println(duck.fly())

}