package data

class Person {
    var firstName : String = ""
    var middleName : String? = null
    var lastName : String = ""

    fun sayHello(name : String) : Unit{
        println("Hello $name, my name is $firstName")
    }

    fun sayHello(firstName : String, lastName : String) : Unit {
        println("Hello $firstName $lastName, my name is ${this.firstName}")
    }

    fun run() : Unit {
        println("I'm run...")
    }

    fun fullName() : String {
        return "$firstName $middleName $lastName"
    }

}