package org.example.lesson_21

import java.io.File

fun File.writeWordToStart(word: String) {
    val lowerWord = word.lowercase()

    val currentContent = if (this.exists()) this.readText() else ""
    val newContent = "$lowerWord\n$currentContent"
    this.writeText(newContent)
}

fun main() {
    val file = File("word.txt")

    file.writeWordToStart("Hello")

    println("Содержимое файла: ")
    println(file.readText())
}