package app

import data.Game
import data.Login
import data.MinMax


fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun login(login : Login, callback : (Login) -> Boolean) : Boolean {
    return callback(login)
}

fun main() {

    val game = Game("Kotlin game", 1000)
    val (nameGame1, priceGame1) = game
    println(nameGame1)
    println(priceGame1)

    val game2 = Game("Kotlin Adventures", 2000)
    val (nameGame2, _) = game2
    println(nameGame2)

    val (min, max) = minmax(100, 10)
    println("Min = $min")
    println("Max = $max")

    val request = Login("muslim", "rahasia")
    val success = login(request) {(user, pass) ->
        user == "muslim" && pass == "rahasia"
    }
    println(success)
}