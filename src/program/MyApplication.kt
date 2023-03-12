package program

import annotations.Fancy

@Fancy(author = "Muslim")
class MyApplication(val name : String, val Version : Int) {
    fun info() : String ="Name ${this.name}-${this.Version}"
}

fun main() {
    val myApp = MyApplication("Kotlin Game", 1)
    myApp.info()
}