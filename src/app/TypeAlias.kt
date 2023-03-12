package app

typealias App = Application
typealias App2 = data2.Application
typealias StringSupplier = () -> String

fun sayHello(stringSupplier : StringSupplier) {
    println("Hello, my name is ${stringSupplier()}")
}

fun main() {

    val appV1 = App("Kotlin App")
    val appV2 = App2("Kotlin App V2")
    sayHello { "Muslim" }

}