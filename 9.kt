class soma{
  var name: String=" "
  get()=field
  set(value){
    if(value.isNotBlank()){
      field=value
    }
  }
  var age:Int=0
}

class Country(val name: String, val area:Int){

  constructor(name:String): this(name,0){
    println("constructor called")
  }
  //init
  
  fun print()="$name, $area"
}
fun main(){
  var me=soma()
  val country=Country("In",62487)
  val spain=Country("Spain")
  me.name="Soumya"
  me.age=20

  println(me.name)
  println(me.age)

  println(country.name)
  println(country.area)

  println(spain.name)
  println(spain.area)
}