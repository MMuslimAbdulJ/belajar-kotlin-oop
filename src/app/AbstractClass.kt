package app

import data.City
import data.Country
import data.Location


fun main() {
//    val location = Location("Cianjur") //error
    val city = City("Cianjur")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}