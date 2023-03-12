package app

class Application(val name : String) {
    object Utilities {
        fun hello(name : String) : Unit {
            println("Hello $name")
        }
    }
}