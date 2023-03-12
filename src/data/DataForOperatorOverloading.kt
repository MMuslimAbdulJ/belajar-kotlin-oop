package data

data class FruitUnary(val x: Int, val y: Int) {
    operator fun unaryMinus(): FruitUnary {
        return FruitUnary(-x, -y)
    }
}

data class IncDec(val a: Int) {
    operator fun inc(): IncDec {
        return IncDec(this.a + 1)
    }

}

data class Fruit(val quantity: Int) {

    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(this.quantity + fruit.quantity)
    }

}

data class InOperator(val b: Array<Int>) {
    operator fun contains(number: Int): Boolean {
        return b.contains(number)
    }

    operator fun get(number: Int): Int {
        return this.b.get(number)
    }
}

data class Hello(val name: String) {
    operator fun invoke(): Unit {
        println("Hello ${this.name}")
    }
}

data class AugmentedAssign(val number1: Int) {
    operator fun plusAssign(number2: Int): Unit {
        println(this.number1 + number2)
    }
}

class EqualityInequeality(val a: Int) {
    override operator fun equals(obj: Any?): Boolean {
        if (obj === this) return true
        if (obj !is EqualityInequeality) return false
        return obj.a == a
    }
}

class PersonCompare(val firstName: String, val lastName: String) : Comparable<PersonCompare> {
    override fun compareTo(other: PersonCompare): Int {
        return compareValuesBy(this, other, PersonCompare::firstName, PersonCompare::lastName)
    }
}