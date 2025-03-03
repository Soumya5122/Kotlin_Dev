fun main(){
  val age=18
  fub ageOf(vararg ages: Int): Boolean{
    return ages.any { age-> age >=18}
  }
  println(ageOf(12,13,14,15))
}