package org.example.lesson_2

fun main() {
    val numberOfPermanentEmployees: Int = 50
    val numberOfTrainees: Int = 30
    val salaryOfPermanentEmployee: Int = 30000
    val salaryTrainee: Int = 20000
    val expensesForPermanentEmployees = numberOfPermanentEmployees * salaryOfPermanentEmployee
    println(expensesForPermanentEmployees)
    val internСosts = numberOfTrainees * salaryTrainee
    println(internСosts)
    val generalExpenses = expensesForPermanentEmployees + internСosts
    println(generalExpenses)
    val averageSalary = generalExpenses / (numberOfTrainees + numberOfPermanentEmployees)
    println(averageSalary)
}