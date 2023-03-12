package app

import data.Minus
import data.Modulo
import data.Operation
import data.Plus

fun operation(number1 : Int, number2 : Int, operation: Operation) : Int {
    return when(operation){
        is Plus -> number1 + number2
        is Minus -> number1 - number2
        is Modulo -> number1 % number2
    }
}

fun main() {

    println(operation(2,3, Plus()))
    println(operation(10, 5, Minus()))
    println(operation(10, 3, Modulo()))

}