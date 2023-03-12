package app

import data.Address
import data.Car

fun main() {
    val address1 = Address("Jl. Ciheulang", "Cianjur")
    val address2 = Address("Jl. KH. Shaleh", "Bogor", "Amerika")
    println(address1.city)
    println(address2.city)


    val avanza = Car("Lamborghini")
    println(avanza.brand)
}