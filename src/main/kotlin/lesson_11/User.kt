package org.example.lesson_11

class RecipeСategory (
    val id: Int,
    val name: String,
) {
    val favorites = mutableListOf<Recipe>()

    fun addFavorites(recipe: Recipe) {
        favorites.add(recipe)
        println("Рецепт ${recipe.name} добавлен в избранное, в категорию $name")
    }
}

class Ingredient (
    val id: Int,
    val name: String,
    val description: String = " ",
)

class Recipe (
    val id: Int,
    val name: String,
    val category: RecipeСategory,
    val ingredients: List<Ingredient>,
    val instructions: String = " ",
)

val categoryBurgers = RecipeСategory(1, "бургеры")
val categoryDesserts = RecipeСategory(2, "десерты")
val сategoryPizza = RecipeСategory(3, "пицца")
val categoryFish = RecipeСategory(4, "рыба")

val ingredients1 = Ingredient (1, "творог", "360 г")
val ingredients2 = Ingredient (2, "куриное яйцо", "2 шт")
val ingredients3 = Ingredient (3, "пшеничная мука", "6 ст ложек")
val ingredients4 = Ingredient (4, "подсолнечное масло", "5 ст ложек")
val ingredients5 = Ingredient (5, "сахар", "2 ст ложки")

var burgerRecipe = Recipe (1, "бургер с грибами и сыром", categoryBurgers,
    listOf(ingredients1, ingredients2, ingredients3, ingredients4, ingredients5)
)

fun main() {
    categoryBurgers.addFavorites(burgerRecipe)
}