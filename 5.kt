class Person(private var _name: String) {

  var name: String
      get() = _name.uppercase()  
  set(value) {
      if (value.isNotEmpty()) {
          _name = value
          
      } else {
          println("Name cannot be empty.")
      }
  }
}

fun main() {
  val person = Person("John")

  
  person.name = "Alice"  
  println(person.name)   
  person.name = ""  
  println(person.name)  
}
