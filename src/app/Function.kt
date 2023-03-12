package app

import data.Person

fun main() {
    val muslim = Person()
    muslim.firstName = "M Muslim"
    muslim.middleName = "Abdul"
    muslim.lastName = "Jabbaar"

    muslim.sayHello("Danny")
    muslim.run()
    println(muslim.fullName())
}