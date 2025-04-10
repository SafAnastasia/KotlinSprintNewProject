package org.example.lesson_3

fun main() {
    var playerString = "D2-D4;0"
    var parts = playerString.split(";")
    var part1 = parts[0]
    var part2 = parts[1]

    var parts1 = part1.split("-")
    var part3 = parts1[0]
    var part4 = parts[1]

    println("$part3\n" +
            "$part4\n" +
            "$part2")



}