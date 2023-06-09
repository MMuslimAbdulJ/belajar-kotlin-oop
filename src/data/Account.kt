package data

import kotlin.properties.Delegates

class Account(description : String = "") {
    val name : String by lazy {
        println("Lazy call")
        "Muslim"
    }

    var description : String by Delegates.observable(description) {
        property, oldValue, newValue ->
        println("${property.name} has changed from $oldValue to $newValue")
    }
}