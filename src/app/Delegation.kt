package app

import data.Delegate
import data.MyBase
import data.MyBaseDelegate

fun main() {

    val base = MyBase()
    base.sayHello("Muslim")

    val myBase = MyBaseDelegate(base)
    myBase.sayHello("Ikhlash")

    val delegate = Delegate(base)
    delegate.sayHello("Danny")
    delegate.sayGoodbye("Eren")

}