package loopingoperations

object LoopingOperations {

  /*
  for loop: Iterating through ranges and collections.
  while loop: Repeating a block of code while a condition is true.
  do-while loop: Similar to while, but guarantees at least one execution.
  for loop with yield: Generating collections using for.
   */


  // ----------------------------------
  // 1. for Loop
  // ----------------------------------
  def forLoopExample(): Unit = {
    println("----- for Loop Example -----")

    // Iterating through a range
    for (i <- 1 to 5) {
      println(s"Range iteration: $i")
    }

    // Iterating through a collection (List)
    val numbers = List(10, 20, 30, 40, 50)
    for (num <- numbers) {
      println(s"List iteration: $num")
    }

    // Nested for loop
    for (i <- 1 to 3; j <- 1 to 2) {
      println(s"Nested loop: i = $i, j = $j")
    }

    // Using a guard (if condition) in for loop
    for (num <- numbers if num % 2 == 0) {
      println(s"Even number: $num")
    }
  }

  // ----------------------------------
  // 2. while Loop
  // ----------------------------------
  def whileLoopExample(): Unit = {
    println("\n----- while Loop Example -----")

    var count = 1
    while (count <= 5) {
      println(s"Count: $count")
      count += 1
    }
  }

  // ----------------------------------
  // 3. do-while Loop
  // ----------------------------------
  def doWhileLoopExample(): Unit = {
    println("\n----- do-while Loop Example -----")

    var count = 1
    do {
      println(s"Count: $count")
      count += 1
    } while (count <= 5)
  }

  // ----------------------------------
  // 4. for Loop with yield
  // ----------------------------------
  def forLoopWithYieldExample(): Unit = {
    println("\n----- for Loop with yield Example -----")

    // Generate a new list by doubling each element
    val numbers = List(1, 2, 3, 4, 5)
    val doubledNumbers = for (num <- numbers) yield num * 2

    println(s"Doubled numbers: $doubledNumbers")
  }

  // ----------------------------------
  // Main method to execute all loop examples
  // ----------------------------------
  def main(args: Array[String]): Unit = {
    // Example 1: for loop
    forLoopExample()

    // Example 2: while loop
    whileLoopExample()

    // Example 3: do-while loop
    doWhileLoopExample()

    // Example 4: for loop with yield
    forLoopWithYieldExample()
  }

}
