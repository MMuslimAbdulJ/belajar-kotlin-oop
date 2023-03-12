package app

import data.Rectangle
import data.Shape
import data.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val rectangle = Rectangle()
    println(rectangle.corner)
    println(rectangle.parentCorner)

    val triangle = Triangle()
    println(triangle.corner)
}