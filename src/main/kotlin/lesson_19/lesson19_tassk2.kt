package org.example.lesson_19

enum class Category {
    CLOTH,
    STATIONERY,
    MISCELLANEOUS;

    fun returnCategoryName(): String {
        return when (this) {
            CLOTH -> "одежда"
            STATIONERY -> "концелярские товары"
            MISCELLANEOUS -> "разное"
        }
    }
}

class Product(val name: String, val idProduct: Int, val category: Category) {
    fun printInfo() {
        println("Товар:$name c ID $idProduct и категорией ${category.returnCategoryName()}")
    }
}

fun main() {
    val product = Product("джинсы", 345, Category.CLOTH)

    product.printInfo()
}