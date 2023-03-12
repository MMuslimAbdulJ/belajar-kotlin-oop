package data

class User(val username : String, val password : String) {

    override fun toString(): String {
        return "Username=$username"
    }

}