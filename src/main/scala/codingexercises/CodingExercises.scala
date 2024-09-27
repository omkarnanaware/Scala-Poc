package codingexercises

object CodingExercises {

  def main(args:Array[String]):Unit = {

    // ---------------------------------------------------------------------------------------------------------------

   // Q 1 Write a program to print "Hello, World!".

    val str = "Hello World!"

    def printFunction(str: String = "Null"): Unit = {
      println(str)
    }
    printFunction(str)

    // ---------------------------------------------------------------------------------------------------------------

    // Q 2 Write a program to swap two variables

    var varA = 10
    var varB = 20

    println(s"varA=${varA},varB=${varB}")

    var varBuff = 0

    varBuff = varA
    varA = varB
    varB = varBuff

    println(s"varA=${varA},varB=${varB}")

    // ---------------------------------------------------------------------------------------------------------------

    // Q3 Write a program to check if a number in list is even or odd.

    /*
    step 1 ) Creat a empty list
    step 2 ) Append 2 random number
    step 3 ) Prepend  2 random number
    step 4 ) Create a function to return List of boolean  True false check
    step 5 ) Create a function which will return List of Map with element and check


     */

    import scala.collection.mutable.ListBuffer

    //Step 1
    var mutableList:ListBuffer[Int] = ListBuffer()
    //Step 2
    mutableList.append(10,20)
    //Step 3
    mutableList.prepend(1,3)



    println(s"ListBuffer created with elements ${mutableList}")

    def evenOddCheckBoolean(list:ListBuffer[Int]):ListBuffer[Boolean] = {

      var listOut: ListBuffer[Boolean] = ListBuffer()

      list.map(x => {
        if(x%2==0){
          listOut.append(true)
        }
        else {
          listOut.append(false)
        }
      })

      listOut
    }

    var listOut = evenOddCheckBoolean(mutableList)

    println(listOut)

    def evenOddCheckListMap( list:ListBuffer[Int]):ListBuffer[Map[Int,Boolean]] = {

      var listOut:ListBuffer[Map[Int,Boolean]] = ListBuffer()
      var listIn = list.distinct



      //Wrong code 1
      //listOut = listIn.map(x => {if (x % 2 == 0) { listOut.append(Map(x -> true)) } else {listOut.append(Map(x -> false))} })

      // I was doing mistake on line no 89 of appending data in the lisOut and agin assigning it listOut which was causing problem a compile time

      //type mismatch;
      // found   : scala.collection.mutable.ListBuffer[Unit]
      // required: scala.collection.mutable.ListBuffer[Map[Int,Boolean]]
      //      listOut = listIn.map(x => {if (x % 2 == 0) { listOut.append(Map(x -> true)) } else {listOut.append(Map(x -> false))} })

      //Correct code 1
      //listIn.map(x => {if (x % 2 == 0) { listOut.append(Map(x -> true)) } else {listOut.append(Map(x -> false))} })

      //Correct code 2
      listOut =  listIn.map(x => {if (x % 2 == 0) { Map(x -> true) } else {Map(x -> false)} })

      listOut
    }

     val listOutMap = evenOddCheckListMap(mutableList)

    println(listOutMap)

    // ---------------------------------------------------------------------------------------------------------------

    // Q4 Write a program to find the factorial of a number

    varA = 5

    var out = Range(1,6).reduce((x,y) => x * y)

    println(out)

    def factorial(ele:Int):Int = {

      if(ele == 1) return 1

      return ele * factorial(ele-1)

    }

    println(factorial(varA))

    // Q5 left/Right rotate list by n position

    val list = List[Int](1,2,3,4,5)

    //          1 2 3 4 5
    //n = 1     5 1 2 3 4  moving last element to first position
    //n = 2     4 5 1 2 3

    def leftRotate(list:List[Int],num:Int):List[Int] = {

      return list.drop(num)++list.take(num)

    }

    def rightRotate(list:List[Int],num:Int):List[Int] = {

      return  list.dropRight(num)++list.takeRight(num)

    }


  }






}
