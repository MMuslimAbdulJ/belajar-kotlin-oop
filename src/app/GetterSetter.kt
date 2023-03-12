package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("Belajar Kotlin")
    note.title = "Belajar Kotlin OOP"
    println(note.title)

    val bigNote = BigNote("belajar kotlin object oriented")
    println(bigNote.title)
    println(bigNote.BigTitle)
}