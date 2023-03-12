package app

import data.Customer
import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val customer = Customer("Muslim", "Standard", 100000000)
    val premiumCustomer = PremiumCustomer("Muslim")
    val executiveCustomer = ExecutiveCustomer("Muslim", 100000000)
}