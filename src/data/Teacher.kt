package data

open class Teacher(public val name : String) {

    private fun teacher() {
        println("Teach!")
    }

    open protected fun test() {
        println("Test")
        this.sayHo()
    }

    private fun sayHo() {
        println("Ho!")
    }

}

class SuperTeacher(name : String) : Teacher(name) {
    override public fun test() {
        println("Test")
    }
}
