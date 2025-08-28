package org.example.lesson_15

interface FlyingCreature {
    fun fly(): String
}

interface SwimmingCreature {
    fun swim(): String
}

class CrucianCarp : SwimmingCreature {
    override fun swim(): String {
        return "Карась плавает"
    }
}

class Gull : FlyingCreature {
    override fun fly(): String {
        return "Чайка летает"
    }
}

class Duck : FlyingCreature, SwimmingCreature {
    override fun swim(): String {
        return "Утка умеет плавать вод водой"
    }

    override fun fly(): String {
        return "Утка умеет летать не высоко над водой"
    }
}

fun main() {
    val carp = CrucianCarp()
    val gull = Gull()
    val duck = Duck()

    println(carp.swim())
    println(gull.fly())
    println(duck.swim())
    println(duck.fly())

}