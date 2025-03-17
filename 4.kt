fun main(){
  //lambda
  val add: (Int,Int) -> Int ={x:Int,y:Int ->x+y}
  val add1={x:Int,y:Int -> x+y}
  println(add(3,4))
  println(add1(9,4))

  //high order functions
  val list=(1..100).toList()
  val list2=(100..200).toList()
  println(list.filter({element->element%2==0}))
  println(list2.filter({it%2==0}))
  println(list.filter({it.even()}))
  println(list.filter(::isEven))

  //map
  val doubled =list.map{it*2}
  println(doubled)

  //flatmap
  val nestedList=listOf(
    (1..10).toList(),
    (20..30).toList(),
    (31..40).toList()
  )

  val notflattened=nestedList.map{it.sortedDescending()}
  //val notflattened=nestedList.map{it.sortedDescending()}.flatten() to flatten
  println(notflattened)

  val flattened=nestedList.flatMap{it.sortedDescending()}
  println(flattened)

  //take and drop also there are functions like first and last only for specific first or last element
  val list3=(1..1000).toList()
  val first10= list3.take(10)
  val withoutFirst900= list3.drop(900)
  println(first10)
  println(withoutFirst900)

  val list4=generateSequence(0){it+10}
  val first11=list4.take(10).toList()
  val first12=list4.take(20).toList()
  println(first11)
  println(first12)


  //zip
  val list7=listOf("Hi","there","Kotlin")
  val containsT=listOf(false,true,true)
  val zipped: List<Pair<String,Boolean>> = list7.zip(containsT)

  val mapping = list7.zip(list7.map { it.contains("t") })

  println(zipped)
  println(mapping)

  //chaining 
  val inputRows=listOf(
    mapOf("input01.csv" to listOf(3,5,7,9,-345,2,6,8)),
    mapOf("input02.csv" to listOf(1,2,4)),
    mapOf("input03.csv" to listOf(34,467,34,11,7))
  )
  val cleaned=inputRows.flatMap{it.values}
    .flatten()//converts an array into flat list
    .filter { it in 0..100}
    .toIntArray()
  println(cleaned.joinToString())
}


fun isEven(i:Int) =i%2==0

fun Int.even()=this%2==0
//Functional Programming