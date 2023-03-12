package data

interface Base {
    fun sayHello(name : String)
    fun sayGoodbye(name : String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Goodbye $name")
    }
}

class MyBaseDelegate(val base : Base) : Base {
    override fun sayHello(name: String) {
        this.base.sayHello(name)
    }

    override fun sayGoodbye(name: String) {
        this.base.sayGoodbye(name)
    }
}

class Delegate(val base : Base) : Base by base