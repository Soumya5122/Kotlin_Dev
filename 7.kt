class Robo(val name:String, val age: Int){
  
  init{
    println("Now the details of Robo will be printed")
  }
  init{
    println(" the details of Robo will be printed")
  }
  fun displayInfo(){
  println("Rob name is $name and age $age")
}
  
  
}
fun main(){
   val rob=Robo("Alice",23) 
   rob.displayInfo()
  
}