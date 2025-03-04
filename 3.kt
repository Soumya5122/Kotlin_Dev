import java.util.Random
import Kotlin.io.IOException
fun main() {

  val randoms: MutableList<Int> = mutableListOf()

  for (i in 1..100) {
    randoms.add(Random().nextInt(100) + 1)
  }

  var i = 0
  while (i < randoms.size && randoms[i] > 10) {
    println(randoms[i])
    i++
  }

//
  val x=concat(texts=listOf("Kotlin","Java","Scala"),separator=":")
  println(x)

  //
  val input=try{
    getExternalInput()
  }
  catch(e: IOException){
    println("Finished executing the error")
    " "
  }
  finally{
    println("Done with solving error")
  }
  
}
//named arguments and default parameter
fun concat(texts: List<String>, separator:String =", ") = texts.joinToString(separator)

//exceptions
fun getExternalInput(): String{
  throw IOException("Could not read external Input")
}

