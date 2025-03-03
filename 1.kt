fun main(){
  var age: Int
  age = 2
 
  val age1 = 44
  val str: String? =null //it can hold nullable data as well as other data
  //age1=43 cannot be reassigned
  println("Age of ${age} and age1 of ${age1}")
  println(str)


  // if loop 

  
  val i=17
  val x = if (i<15){
    println("i is small")
    "small"
    
  }
  else if(i>=15 && i<=25){
    println("it's okay")
    "medium"
    
  }
  else{
    println("it's pretty large")
    "large"  //return value of  x if not assigned return Kotlin Unit
  }
  println(x)


//if()
//else if ()
//else

//when loop

val price=34
when(price){
  0 -> println("free meal ")
  in 1..5 ->println("less price")
  else ->println("not on sale")
}

//for loop

for(i in 1..5){
  println("$i")
}
for(i in 10 downTo 5 step 2){
  println("$i")
}
}