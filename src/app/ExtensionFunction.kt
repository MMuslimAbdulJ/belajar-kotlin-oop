package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student: Student? = Student("Muslim", 22)
    student.sayHello("Arfah")
    println(student?.upperName)
}