package app

data class Friend(val name: String)

fun sayHelloWithIf(friend: Friend?): Unit {
    if (friend != null) {
        println("Hello ${friend.name}")
    }
}

fun sayHelloWithChecking(friend: Friend?): Unit {
    println("Hello ${friend?.name}")
}

fun sayHelloWithElvis(friend: Friend?) : Unit {
    val name = friend?.name ?: ""
    println("Hello $name")
}

fun sayHelloLoveNull(friend: Friend?) : Unit {
    val name = friend!!.name
    println("Hello $name")
}

fun main() {
    sayHelloWithIf(Friend("Muslim"))
    sayHelloWithChecking(Friend("Danny"))
    sayHelloWithElvis(Friend("Ikhlash"))
    sayHelloLoveNull(Friend("Arfah"))
}