package data

class Car(brandParam : String, nameParam :String?, yearParam : Int) {

    init {
        println("Car $brandParam dibuat...")
    }

    var brand : String = brandParam
    var name : String? = nameParam
    var year : Int = yearParam


    constructor(brandParam: String, yearParam: Int) : this(brandParam, null, yearParam){
        println("Secondary Constructor 1")
    }

    constructor(brandParam: String) : this(
        brandParam,
        2020
    ) {
        println("Secondary Constructor 2")
    }
}