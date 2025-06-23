package org.example.lesson_11

class User (
    val userName: String,
    val avatar: String,
    val status: String = "микрофон выключен"
)

class Room (
    var cover: String,
    var name: String,
    var listParticipants: MutableList<User>
) {
    val participants = MutableList<User>()

    fun addingParticipant(user: User){
        participants.add(user)
        println("Добавить участника: ${user.userName} в комнату: $cover")

    }
    fun statusUpdate(userName: String, newStatus: String) {
        user.status = newStatus
        println("Обновленный статус: $newStatus")
    }
}

val room = Room("обложка","разговоры")
val user1 = User("anna","кот", "разговаривает")


fun main() {
    room.addingParticipant(user1)
    room.statusUpdate("anna", "микрофон выключен")
}