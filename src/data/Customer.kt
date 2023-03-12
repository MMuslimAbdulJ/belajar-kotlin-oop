package data

open class Customer(val name : String, val type :String, val balance :Long) {
    constructor(name : String, type : String) : this(name, type, 0)
    constructor(name : String, balance: Long) : this(name, "Standard")
}

class PremiumCustomer : Customer {
    constructor(name : String, type: String, balance: Long) : super(name, type, balance)
    constructor(name : String, type : String) : super(name, type)
    constructor(name : String) : super(name, 100000000)
}

class ExecutiveCustomer(name : String, type: String, balance: Long) : Customer(name, type, balance) {
    constructor(name: String, type: String) : this(name, type, 100000000)
    constructor(name : String) : this(name, "Executive")
    constructor(name : String, balance: Long) : this(name, "Executive", balance)
}