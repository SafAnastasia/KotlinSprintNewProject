package org.example.lesson_19

enum class AmmoType(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
    NONE(0)
}

class Tank {
    private var currentAmmo: AmmoType = AmmoType.NONE
    fun equipAmmo(ammo: AmmoType) {
        currentAmmo = ammo
        println("Танк заряжен патронами:${currentAmmo.name}")
    }

    fun shoot() {
        if (currentAmmo == AmmoType.NONE) {
            println("Танк не заряжен")
        } else {
            println("Выстрел! Нанесено урона ${currentAmmo.damage}")
        }
    }
}

fun main() {
    val tank = Tank()
    tank.shoot()
    tank.equipAmmo(AmmoType.GREEN)
    tank.shoot()
    tank.equipAmmo(AmmoType.RED)
    tank.shoot()
}