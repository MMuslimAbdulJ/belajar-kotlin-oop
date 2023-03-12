package app

import data.Gender

fun main() {

    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGender : Array<Gender> = Gender.values()

    println(man)
    println(woman)
    println(allGender.toList())

    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")
    println(manFromString)
    println(womanFromString)

    man.showDescription()
    woman.showDescription()
}
