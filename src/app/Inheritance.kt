package app

import data.Manager
import data.VicePresident

fun main() {
    val muslim  = Manager("Muslim")
    muslim.sayHello("Ikhlash")

    val danny = VicePresident("Danny")
    danny.sayHello("Ikhlash")
}