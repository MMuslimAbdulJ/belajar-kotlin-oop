package app

import data.SuperTeacher
import data.Teacher

fun main() {

    val teacher = Teacher("Muslim")
//    teacher.teach() //error

    val superTeacher = SuperTeacher("Muslim")
    superTeacher.test()

}