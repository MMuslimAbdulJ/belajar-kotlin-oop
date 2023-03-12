package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {

    var employee : Employee = Employee("Muslim")
    employee.sayHello("Ikhlash")

    employee = Manager("Muslim")
    employee.sayHello("Danny")

    employee = VicePresident("Muslim")
    employee.sayHello("Arfah")

}