package org.example.lesson_14

open class Message(
    val author: String,
    val id: Int,
    val text: String
)

class ChildMessage(
    author: String,
    id: Int,
    text: String,
    val parentMessageId: Int
) : Message(author, id, text)

class Chat(
    val name: String,
    val nameId: Int,
) {
    val messages = mutableListOf<Message>()
    var messageIdCounter = 1

    fun addMessage(text: String, author: String) {
        val message = Message(author, messageIdCounter++, text)
        messages.add(message)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val threadMessage = ChildMessage(author, messageIdCounter++, text, parentMessageId)
        messages.add(threadMessage)
    }

    fun printChat() {
        val groupedMessages = messages.groupBy {
            when (it) {
                is ChildMessage -> it.parentMessageId
                else -> it.id
            }
        }

        for (message in messages) {
            if (message is ChildMessage) continue

            println("${message.author}: ${message.text} (ID: ${message.id})")

            val threadMessages = groupedMessages[message.id]?.filterIsInstance<ChildMessage>()
            threadMessages?.forEach {
                println("\t↳ ${it.author}: ${it.text} (ID: ${it.id})")
            }
        }
    }
}

fun main() {
    val chat = Chat("Чат", 2567)
    chat.addMessage("Привет всем!", "Анна")
    chat.addThreadMessage("Привет, Анна!", "Олег", 1)
    chat.addThreadMessage("Как дела?", "Мария", 1)

    chat.printChat()
}
