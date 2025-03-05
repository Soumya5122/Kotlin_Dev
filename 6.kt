import jakarta.validation.constraints.Size

class User {
    var username: String = ""
        @setparam:Size(min = 3, max = 15) set
}

fun main() {
    val user = User()
    user.username = "John" 
    println(user.username)
}