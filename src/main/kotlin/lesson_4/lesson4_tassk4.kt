package org.example.lesson_4

fun main(){
    var trainingDay = 5
    val oddDin = trainingDay % 2 != 0
    val evenDays = !oddDin
    println(
        """
        Упражнения для рук:       $oddDin
        Упражнения для ног:       $evenDays
        Упражнения для спины:     $evenDays
        Упражнения для пресса:    $oddDin
        """.trimIndent()
    )
}