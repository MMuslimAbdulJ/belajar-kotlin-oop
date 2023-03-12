package data

class Student(var name : String, var age : Int)

fun Student?.sayHello(name : String) {
    if(this != null) {
        println("Hello $name, my name is ${this.name}")
    }
}

val Student.upperName : String
    get() = this.name.uppercase()