//collections-list,set,map
fun main()
{
  val array= arrayOf(2,3,4,5)
  println(array.joinToString())
  val array1= intArrayOf(2,3,4,5)
  println(array1.joinToString())

  
  val p: MutableList<String> =mutableListOf("tr","tm")
  println("${p.first()} ")
  println("tr" in p)
  println("tr" !in p)

  val list=set.toList()

//LIST
//.first()
//.last()
//.count()
//.listOf()
//in !in
//.add()
//.addAll()

//SETS-unique ,unordered
//.setOf()
//.mutableSetOf()
//.add()
//.remove()

//MAP
//.mapOf()
//.mutableMapOf()
//to
//.remove()
//.count()
//.containsKey()
//.keys
//.values

val map=mapOf(Pair(1,"Kotlin"), Pair(2,"Android"))
println(map)

val mutableMap= mutableMapOf( 1 to "Kotlin", 2 to "Android")
println(mutableMap)


}

