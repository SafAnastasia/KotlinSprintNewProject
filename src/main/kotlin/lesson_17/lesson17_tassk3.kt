package org.example.lesson_17

class Folder(private val realName: String, private val realNumberOfFiles: Int, private val isSecret: Boolean) {
    val nameFolder: String
        get() = if (isSecret) "скрытая папка" else realName
    val numberOfFiles: Int
        get() = if (isSecret) 0 else realNumberOfFiles
}

fun name() {
    val secretFolder = Folder("Личная папка", 43, true)

    println("Имя папки: ${secretFolder.nameFolder}")
    println("Количество файлов: ${secretFolder.numberOfFiles}")
}