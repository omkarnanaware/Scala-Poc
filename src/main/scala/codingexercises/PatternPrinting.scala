package codingexercises

object PatternPrinting extends App{

  //Print the pattern
  /*
  *
  *
  *
  *
   */

  val numn  = 4;

  for(i <- 1 to numn){ println("*")}

  println()

  //Print the pattern
  /*
  *
  * *
  * * *
  * * * *
   */

  for(i <- 1 to numn){
    for(j <- 1 to i){
      print("*\t")
    }
    println()
  }

  for(i <- Seq(1,2,3,4)){
    println(i)
  }

}
