package org.example.lesson_8

import java.security.KeyStore.TrustedCertificateEntry

fun main() {
    val pancakeRecipe = arrayOf("яйца", "молоко", "соль", "мука", "дрожжи")
    println("Какой ингредиент нужно найти в рецепте: ")
    val ingredient = readLine()
    var found = false

    for (i in pancakeRecipe) {
        if (ingredient == i) {
            found = true
            break
        }
    }
    if (found) {
        println("Ингредиент $ingredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}