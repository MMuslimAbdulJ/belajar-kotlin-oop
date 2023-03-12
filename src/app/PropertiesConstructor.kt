package app

import data.User

fun main() {
    val user1 = User("Muslim", "Rahasia")
    val user2 = User("Ikhlash", "rahasia12345")

    println(user1.username)
    println(user1.password)
    println(user2.username)
    println(user2.password)

}