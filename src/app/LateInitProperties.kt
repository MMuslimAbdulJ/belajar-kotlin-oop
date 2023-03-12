package app

import data.Television

fun main() {
    val television = Television()
//    println(television.brand)//error
    television.initTelevision("SONY")
    println(television.brand)
}