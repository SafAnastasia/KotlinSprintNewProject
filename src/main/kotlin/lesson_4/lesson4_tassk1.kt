package org.example.lesson_4

const val TOTAL_RESTAURANT_TABLES = 13

fun main() {
    var quantityToday = 13
    var quantityTomorrow = 9
    val numberOfTablesReservedForToday: Boolean = quantityToday > TOTAL_RESTAURANT_TABLES
    val numberOfTablesReservedForTomorrow: Boolean = quantityTomorrow < TOTAL_RESTAURANT_TABLES
    println("[Доступность столиков на сегодня:$numberOfTablesReservedForToday]\n[Доступность столиков на завтра:$numberOfTablesReservedForTomorrow]")
}


