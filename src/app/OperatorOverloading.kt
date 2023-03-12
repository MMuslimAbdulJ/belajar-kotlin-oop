package app

import data.*

fun main() {

    val unaryFruit1 = FruitUnary(10, 5)
    println(-unaryFruit1)

    var a = IncDec(10)
    println(a++)
    println(a++)

    val fruitPlus1 = Fruit(10)
    val fruitPlus2 = Fruit(10)
    val fruitPlusResult = fruitPlus1 + fruitPlus2
    println(fruitPlusResult)

    val arrayNumber = arrayOf(1,2,3,4,5)
    val inOperator = InOperator(arrayNumber)
    val findNumber = 3
    println(findNumber in inOperator)

    val getNumberFromIndex = 2
    println(inOperator[getNumberFromIndex])

    val hello = Hello("Muslim")
    hello()

    val augmentedAssign = AugmentedAssign(9)
    val addNumber = 1
    augmentedAssign += addNumber

    val equalityInequeality1 = EqualityInequeality(10)
    val equalityInequeality2 = EqualityInequeality(10)
    println(equalityInequeality1 == equalityInequeality2)

    val p1 = PersonCompare("M", "Muslim")
    val p2 = PersonCompare("M", "milsuM")
    println(p1 <= p2)

}