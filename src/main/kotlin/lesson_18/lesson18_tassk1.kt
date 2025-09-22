package org.example.lesson_18

class Order(val orderNumber: Int, val items: Any) {
    fun displayOrderInfo() {
        when (items) {
            is String -> {
                println("Заказан одни товар: $items")
            }

            is List<*> -> {
                val itemsList = items.joinToString(", ")
                println("Заказаны товары: $itemsList")
            }

        }

    }
}

fun main() {
    val order = Order(567, listOf("телефон", "рюкзак", "перчатки"))
    val order2 = Order(234, "джинсы")

    order.displayOrderInfo()
    order2.displayOrderInfo()
}

