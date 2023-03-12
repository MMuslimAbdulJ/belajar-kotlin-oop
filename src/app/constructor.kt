package app

import data.Car

fun main() {

//    val avanza = Car("Toyota", "Avanza", 2020)
//    val civic = Car("Honda", "Civic", 2023)
//
//    println(avanza.brand)
//    println(avanza.name)
//    println(avanza.year)
//    println(civic.brand)
//    println(civic.name)
//    println(civic.year)

    val contohLambda : (String, String) -> Unit = {nama : String, jabatan : String ->
        println("$nama $jabatan")
    }

    val lambdaUpper = {value : String -> {
        value.uppercase()
    }}

    val lambdaLower = {value : String -> {
        value.lowercase()
    }}

    fun sayHello(name : String, hello : (String, String) -> Unit) : Unit {
        hello(name, "Babang")
    }

//    fun sayHello(name : String, hello : (String) -> String) : String {
//        hello(name)
//    }

    sayHello("Muslim", contohLambda)


}

