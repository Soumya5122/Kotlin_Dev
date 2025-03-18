//data class


//generated hascode(), equals(), toString(), copy(), destructing operator

data class Address(val street: String, val number: Int,val postcode: String)

//enum 

//enum class Direction(degree: Double){
// NORTH(0.0), EAST(90.0), SOUTH(180.0),WEST(270.0)
//}

enum class Suits{
  HEARTS, SPADES, DIAMONDS, CLUBS
}

fun main(){

  //data
  val addr=Address("MainStreet", 87, "6426")
  val addr1=Address("MainStreet", 87, "6426")

  //toString()
  println(addr)

  //referential equality
  println(addr===addr1)

  //structural equality
  println(addr==addr1)

  //copy
  val neigh=addr.copy()
  println(neigh)

  //destructing operator
  addr.component1()
  val (street, number,postcode)=addr
  println("$street , $number, $postcode")



  //enum
  val suit=Suits.SPADES

  val color= when(suit){
    Suits.HEARTS, Suits.DIAMONDS ->"red"
    Suits.SPADES, Suits.CLUBS ->"Black"
  }
  println(color)
}