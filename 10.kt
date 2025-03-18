//data class


//generated hascode(), equals(), toString(), copy(), destructing operator

data class Address(val street: String, val number: Int,val postcode: String)

fun main(){
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
}