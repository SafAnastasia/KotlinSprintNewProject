package org.example.lesson_15

abstract class ForumUser(val userName: String, val userId: Int) {
    abstract fun readForum()
    abstract fun writeMessage(message: String)
}

class RegularUser(userName: String, userId: Int) : ForumUser(userName, userId) {
    override fun readForum() {
        println("Пользователь: $userName c ID: $userId читает сообщение")
    }

    override fun writeMessage(message: String) {
        println("Пользователь: $userName написал сообщение: $message")
    }

}

class Admin(userName: String, userId: Int) : ForumUser(userName, userId) {
    override fun readForum() {
        println("Администратор: $userName с ID: $userId читает сообщения")
    }

    override fun writeMessage(message: String) {
        println("Администратор: $userName написал сообщение: $message")
    }

    fun deleteMessage(messageID: Int) {
        println("Администратор: $userName с ID $userId удалили сообщение с ID: $messageID")
    }

    fun deleteUser(userIdToDelete: Int) {
        println("Администратор: $userName с ID: $userId удалили пользоваетеля с ID: $userIdToDelete")
    }

}

fun main() {
    val regularUser = RegularUser("Нина", 435)
    val admin = Admin("Алекс", 222)

    regularUser.readForum()
    regularUser.writeMessage("Привет!")

    admin.readForum()
    admin.writeMessage("Всем привет!")
    admin.deleteMessage(11)
    admin.deleteUser(435)
}