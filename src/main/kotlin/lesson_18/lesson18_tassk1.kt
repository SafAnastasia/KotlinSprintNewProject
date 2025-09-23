package org.example.lesson_18

class Order(val orderNumber: Int) {

    fun printOrder(product: String) {
        println("Заказан одни товар: $product")
    }

    fun printOrder(products: List<String>) {
        println("Заказано несколько товаров: ${products.joinToString(" , ")}")
    }
}

fun main() {
    val order = Order(1)

    order.printOrder("яблоко")
    order.printOrder(listOf("хлеб", "авокадо", "масло"))
}

