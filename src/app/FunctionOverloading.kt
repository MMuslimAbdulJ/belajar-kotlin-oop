package app

import data.Person

fun main() {
    val muslim = Person()
    muslim.firstName = "Muslim"
    muslim.sayHello("Danny")
    muslim.sayHello("Husni", "Ramadhan")
}