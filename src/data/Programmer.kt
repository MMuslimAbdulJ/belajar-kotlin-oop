package data

class Programmer(val name : String) {

    companion object {
        fun getLanguage(lang : String){
            println("My programming language is $lang")
        }
    }

}