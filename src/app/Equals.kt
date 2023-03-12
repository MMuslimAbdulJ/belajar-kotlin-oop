package app

import data.Company


fun main() {
    val company1 = Company("Muslim")
    val company2 = Company("Muslim")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)


    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())

}