package app

import Exception.LoginException
import Exception.ValidationException

fun sayHelloWithValidate(name : String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {

    try {
        sayHelloWithValidate("Muslim")
    } catch (error : ValidationException) {
        println("Error : ${error.message}")
    } catch (error : LoginException) {
        println("Error : ${error.message}")
    } finally {
        println("Finally block will always executed")
    }

}