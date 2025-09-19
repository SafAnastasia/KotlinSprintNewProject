package org.example.lesson_17

class Folder(val realName: String, val realNumberOfFiles: Int, private val isSecret: Boolean) {
    val folderName: String
        get() = if (isSecret) "скрытая папка" else realName
    val numberOfFiles: Int
        get() = if (isSecret) 0 else realNumberOfFiles
}

fun main() {
    val secretFolder = Folder("Личная папка", 43, true)

    println("Имя папки: ${secretFolder.folderName}")
    println("Количество файлов: ${secretFolder.numberOfFiles}")
}