package app

import data.Person

fun main() {
    val muslim = Person()
    val ikhlash = Person()
    val danny = Person()

    muslim.firstName = "Muslim"
    ikhlash.firstName = "Ikhlash"
    danny.firstName = "Danny"

    println(muslim.firstName)
    println(ikhlash.firstName)
    println(danny.firstName)

}