package data

class Note(title : String) {
    var title : String = title
        get() = field
        set(value) {field = value}
}

class BigNote(val title : String){
    val BigTitle : String
        get() = title.uppercase()
}

