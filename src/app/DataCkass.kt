package app

import data.Product

fun main() {
    val product1 = Product("Mie Sedaap", 2500, "Food")
    println(product1)

    val product2 = product1.copy(name = "Indomie")
    println(product2)

    val product3 = Product("Mie Sedaap", 2500, "Food")

    println(product1 == product1)
    println(product1 == product2)
    println(product1 == product3)
    println(product1.hashCode())
    println(product2.hashCode())
    println(product3.hashCode())

}