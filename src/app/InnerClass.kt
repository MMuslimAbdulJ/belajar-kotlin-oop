package app

import data.Boss

fun main() {

    val muslim = Boss("Muslim")
    val employee1 = muslim.Employee("Danny")
    val employee2 = muslim.Employee("Ikhlash")

    val arfah = Boss("Arfah")
    val employee3 = arfah.Employee("Husni")
    val employee4 = arfah.Employee("Ferdinan")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}