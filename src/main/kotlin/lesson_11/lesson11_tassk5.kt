package org.example.lesson_11


class Forum() {
    private val users = mutableMapOf<Int, UserForum>()
    private val messages = mutableListOf<MessageForum>()
    private var userIdCounter = 1

    private val builder = Builder()

    fun createNewUser(name: String): UserForum {
        val user = builder.createNewUser(userIdCounter++, name)
        users[user.userId] = user
        return user
    }

    fun createNewMessage(authorId: Int, text: String) {
        val author = users[authorId] ?: return
        val msg = builder.createNewMessage(author.userId, text)
        messages.add(msg)
    }

    fun printThread() {
        for (msg in messages) {
            val name = users[msg.authorId]?.userName ?: "Неизвестный"
            println("$name: ${msg.message}")
        }
    }

    private class Builder {
        fun createNewUser(id: Int, name: String): UserForum {
            return UserForum(id, name)
        }

        fun createNewMessage(authorId: Int, text: String): MessageForum {
            return MessageForum(authorId, text)
        }
    }
}

class UserForum(
    val userId: Int,
    val userName: String
)

class MessageForum(
    val authorId: Int,
    val message: String
)

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Олег")
    val user2 = forum.createNewUser("Анна")

    forum.createNewMessage(user1.userId, "Привет!")
    forum.createNewMessage(user1.userId, "Как дела?")
    forum.createNewMessage(user2.userId, "Привет! Хорошо!")
    forum.createNewMessage(user2.userId, "Как твои дела?")

    println("Выводим форум")
    forum.printThread()
}