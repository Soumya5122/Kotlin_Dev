package oo

//if you want to override any methods or variables you need to declare as open method or variable

open class Shape(val name:String){
  open fun area()=0.0
}
class Circle(name:String,val radius:Double): Shape(name){
  override fun area()=Math.PI * Math.pow(radius,2.0)
}
fun main(){
  val scircle=Circle("Small circle",2.0)

  println(scircle.area())
}