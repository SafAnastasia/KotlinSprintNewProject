package org.example.lesson_1

const val SECOND = 60

fun main() {
    val numberOfSeconds = 6480
    val hour = numberOfSeconds / (SECOND * SECOND)
    val minutes = (numberOfSeconds % (SECOND * SECOND)) / SECOND
    val seconds = numberOfSeconds % SECOND
    println("%02d:%02d:%02d".format(hour,minutes,seconds))
}
