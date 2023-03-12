package app

import data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Samsung", "Android")
    println(smartPhone.toString())
    println(smartPhone.hashCode())
}