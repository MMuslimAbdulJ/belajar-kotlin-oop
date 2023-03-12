package app

import data.Student

fun main() {

    val student = Student("Danny", 23)
    val result1: String = student.let {
        "Hello my name is ${it.name} and my age is ${it.age}"
    }
    println(result1)

    val result2: String = student.run {
        "Hello my name is ${this.name} and my age is ${this.age}"
    }
    println(result2)

    val result3 : Student = student.apply {
        "Hello my name is ${this.name} and my age is ${this.age}"
    }
    println(result3)

    val result4 : Student = student.also {
        "Hello my name is ${it.name} and my age is ${it.age}"
    }
    println(result4)

    val result5 : String = with(student) {
        "Hello my name is ${this.name} and my age is ${this.age}"
    }
    println(result5)
}