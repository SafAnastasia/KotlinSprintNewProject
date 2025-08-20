package org.example.lesson_14

open class CelestialBody(val name: String, val atmosphere: Boolean, val suitabilityForLanding: Boolean) {
    open fun celestialBodyInfo() {
        println(
            "Название планеты/спутника: $name, имеет ли планета/спутник атмосферу: $atmosphere, возможность высадки" +
                    "на этой планете/спутнике: $suitabilityForLanding "
        )
    }
}

class Planet(name: String, atmosphere: Boolean, suitabilityForLanding: Boolean) :
    CelestialBody(name, atmosphere, suitabilityForLanding) {
    val satellites = mutableListOf<Satellite>()
    fun addSatellite(satellite: Satellite) {
        satellites.add(satellite)
    }

    override fun celestialBodyInfo() {
        println("Название планеты: $name")
        println("Спутники планеты:")
        satellites.forEach { println(" - ${it.name}") }
    }
}

class Satellite(name: String, atmosphere: Boolean, suitabilityForLanding: Boolean) :
    CelestialBody(name, atmosphere, suitabilityForLanding) {
    override fun celestialBodyInfo() {
        println(
            "Название спутника: $name, имеет ли спутник атмосферу: $atmosphere, возможность высадки"  +
                    " на этом спутнике: $suitabilityForLanding "
        )
    }
}

fun main() {
    val mars = Planet("Mars", true, true)
    val deimos = Satellite("Deimos", true, false)
    val phobos = Satellite("Phobos", false, false)

    mars.addSatellite(deimos)
    mars.addSatellite(phobos)

    mars.celestialBodyInfo()
}