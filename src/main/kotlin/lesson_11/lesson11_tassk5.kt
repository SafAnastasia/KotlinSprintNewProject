package org.example.lesson_11


class Forum private constructor() {
    private val users = mutableMapOf<Int, User>()
    private val messages = mutableListOf<Message>()
    private var userIdCounter = 0

    companion object {
        fun create(): Forum = Forum()
    }
    class User private constructor(
    val userId: Int,
    val userName: String
) {
    class Builder {
        private var userName: String = ""

        fun withName(name: String): Builder {
            this.userName = name
            return this
        }
        fun build(id: Int): User = User(id, userName)
    }
}
    class Message private constructor(
        val authorId: Int,
        val message: String
) {

   class Builder {
       private var authorId: Int = 0
       private var message: String = ""

       fun withAuthorId(id: Int): Builder {
           this.authorId = id
           return this
       }
       fun withMessage(text: String): Builder {
           this.message = text
           return this
       }

       fun build(): Message = Message(authorId, message)

       }
   }

    fun createNewUser(name: String): User {
        val user = User.Builder()
            .withName(name)
            .build(++userIdCounter)

        users[user.userId] = user
        return user
    }

    fun createNewMessage(authorId: Int, text: String): Message? {
        if (!users.containsKey(authorId)) {
            return null
        }

        val message = Message.Builder()
            .withAuthorId(authorId)
            .withMessage(text)
            .build()

        messages.add(message)
        return message

    }

    fun printThread() {
        messages.forEach { msg ->
            val authorName = users[msg.authorId]!!.userName
            println("$authorName: ${msg.message}")

        }
    }
}

fun main() {
    val forum = Forum.create()

    val user1 = forum.createNewUser("Олег")
    val user2 = forum.createNewUser("Анна")

    forum.createNewMessage(user1.userId, "Привет!")
    forum.createNewMessage(user1.userId, "Как дела?")
    forum.createNewMessage(user2.userId, "Привет! Хорошо!")
    forum.createNewMessage(user2.userId, "Как твои дела?")

    println("Выводим форум")
    forum.printThread()


}