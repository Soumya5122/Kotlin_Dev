//lazy sequences

fun main(){
  val verylonglist=(1..999999L).toList()
  val sum=verylonglist
    .asSequence()
    .filter{ it > 50}
    .map{ it*2}
    .take(1000)
    .sum()

  val seq=generateSequence(1,{it+1})

println(sum)
println(seq.take(10).toList())

//high order fumnctions
//let
//with
//use
}