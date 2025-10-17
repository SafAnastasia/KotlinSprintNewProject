package org.example.lesson_10

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val quantity: Int
)

class ShoppingAuth {
    companion object {
        const val VALID_USERNAME = "admin"
        const val VALID_PASSWORD = "password123"
    }

    private val tokenStorage = mutableMapOf<String, UserData>()

    private data class UserData(
        val username: String,
        val cart: List<Product>
    )

    private val cart1 = listOf(
        Product(1, "наушники", 15.0, 2)
    )

    private fun generateToken(): String {
        val lettNumb = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        return (1..32)
            .map { lettNumb.random() }
            .joinToString("")
    }

    fun authenticate(username: String, password: String): String? {
        return if (username == VALID_USERNAME && password == VALID_PASSWORD) {
            val token = generateToken()
            tokenStorage[token] = UserData(username, cart1)
            println("Авторизация успешна! Сгенерирован токен: $token")
            token
        } else {
            println("Неверный логин или пароль")
            null
        }
    }

    fun getShoppingCart(token: String): List<Product>? {
        val userData = tokenStorage[token]

        return if (userData != null) {
            println("Авторизирован. Корзина: ${userData.username}")
            userData.cart
        } else {
            println("Не авторизирован: $token")
            null
        }
    }
}

fun main() {
    val manager = ShoppingAuth()
    val username = "admin"
    val password = "password123"

    val token = manager.authenticate(username, password)

    if (token != null) {
        val cart = manager.getShoppingCart(token)

        if (cart != null) {
            println("Список товаров в корзине:")
            cart.forEach { product ->
                println("- ${product.name}: $${product.price} (${product.quantity} шт.)")
            }
        } else {
            println("Не удалось получить корзину")
        }
    } else {
        println("Авторизация не выполнена")
    }
}

