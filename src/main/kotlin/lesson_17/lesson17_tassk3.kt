package org.example.lesson_17

class Folder(
    private val realName: String,
    private val realFileCount: Int,
    private val isSecret: Boolean
) {
    val name: String
        get() = if (isSecret) "скраытая папка" else realName

    val fileCount: Int
        get() = if (isSecret) 0 else realFileCount
}

fun main() {
    val secretFolder = Folder(
        realName = "Документы",
        realFileCount = 4,
        isSecret = true
    )
    println("Имя папки: ${secretFolder.name}")
    println("Количество файлов: ${secretFolder.fileCount}")
}