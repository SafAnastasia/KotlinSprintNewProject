package org.example.lesson_16

class Order(private val orderNumber: Int, private var status: String) {

    fun printInfo() {
        println("Заказ, номер $orderNumber - статус: $status")
    }

    private fun updateStatus(newStatus: String) {
        status = newStatus
    }

    fun statusChangeManager(newStatus: String) {
        println("Изменение статуса одобрено, статус изменен на $newStatus")
        updateStatus(newStatus)
    }
}

fun requestManagerStatus(order: Order, status: String) {
    order.statusChangeManager(status)
}

fun main() {
    val order = Order(123, "новый")
    order.printInfo()
    requestManagerStatus(order, "собран")
    order.printInfo()
}