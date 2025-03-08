package org.example.lesson_1

fun main() {
    val numberOfSeconds = 6480
    val hour = numberOfSeconds / 3600
    val minutes = (numberOfSeconds % 3600) / 60
    val seconds = numberOfSeconds % 60
    println("%02d:%02d:%02d".format(hour,minutes,seconds))
}
