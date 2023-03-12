package app

import data.HandPhone
import data.Laptop

fun printObject(any : Any) {
    if(any is Laptop) {
        println("Laptop with name " + any.name)
    } else if(any is HandPhone) {
        println("Smartphone with name" + any.name)
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any : Any){
    when (any) {
        is Laptop -> println("Laptop with name " + any.name)

        is HandPhone -> println("Smartphone with name" + any.name)

        else -> println(any)
    }
}

fun printString(any: Any){
    val value = any as String
    println(value)
}

fun printStringSafeNull(any: Any){
    val value : String? = any as? String
    println(value)
}

fun main() {
    printObjectWithWhen(Laptop("Lenovo"))
    printObjectWithWhen(HandPhone("Samsung"))
    printObjectWithWhen("Muslim")
    printObjectWithWhen(22)


    printString("Muslim")
//    printString(1) //error

    printStringSafeNull("Muslim")
    printStringSafeNull(22) //null
}