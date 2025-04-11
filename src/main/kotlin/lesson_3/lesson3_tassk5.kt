package org.example.lesson_3

fun main() {
    var playerString = "D2-D4;0"
    var parts = playerString.split(";","-")
    var part1 = parts[0]
    var part2 = parts[1]
    var part3 = parts[2]
    println(
        "$part1\n" +
                "$part2\n" +
                "$part3"
    )


}