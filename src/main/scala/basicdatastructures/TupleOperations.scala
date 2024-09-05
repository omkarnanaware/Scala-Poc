package basicdatastructures

object TupleOperations {

  /*
  Explanation:
  Tuple Creation:

  You can create tuples with different numbers of elements. For example, Tuple2, Tuple3, etc.
  A tuple is created using the syntax (element1, element2, ...).
  Accessing Tuple Elements:

  Tuple elements are accessed using the methods _1, _2, _3, etc., where the number corresponds to the position of the element.
  Destructuring Tuples:

  You can destructure a tuple into individual variables, which makes it easy to work with the elements of a tuple.
  Using Tuples in Functions:

  A common use case for tuples is returning multiple values from a function. The example function calculateTotalAndAverage returns both the total and average in a tuple.
  Nested Tuples:

  Tuples can be nested, allowing more complex structures. Accessing elements of nested tuples requires multiple levels of _1, _2, etc.
  Transforming Tuples:

  You can transform or copy tuples with updated elements using the copy method, which allows you to update specific elements.
  Usage:
  Copy the code into a Scala environment, and run it to see tuple operations in action.
  It demonstrates tuple creation, access, destructuring, nested tuples, and how tuples can be used in functions to return multiple values.
   */



  // ----------------------------------
  // Tuple Creation and Operations
  // ----------------------------------

  // Creating a tuple with two elements (Tuple2)
  val tuple2: (String, Int) = ("Apple", 5)

  // Creating a tuple with three elements (Tuple3)
  val tuple3: (String, Int, Boolean) = ("Orange", 10, true)

  // Creating a tuple with more than three elements (up to Tuple22 in Scala)
  val tuple4: (String, Int, Boolean, Double) = ("Banana", 7, false, 2.5)

  def tupleOperations(): Unit = {
    println(s"Tuple2: $tuple2")
    println(s"Tuple3: $tuple3")
    println(s"Tuple4: $tuple4")

    // Accessing elements of the tuple
    println(s"First element of tuple2: ${tuple2._1}") // Access elements using _1, _2, etc.
    println(s"Second element of tuple2: ${tuple2._2}")

    println(s"First element of tuple3: ${tuple3._1}")
    println(s"Second element of tuple3: ${tuple3._2}")
    println(s"Third element of tuple3: ${tuple3._3}")

    // Tuple with mixed types
    println(s"First element of tuple4 (String): ${tuple4._1}")
    println(s"Second element of tuple4 (Int): ${tuple4._2}")
    println(s"Third element of tuple4 (Boolean): ${tuple4._3}")
    println(s"Fourth element of tuple4 (Double): ${tuple4._4}")

    // Destructuring tuples (assigning tuple values to individual variables)
    val (fruit, quantity) = tuple2 // Tuple2 destructuring
    println(s"Destructured Tuple2: Fruit = $fruit, Quantity = $quantity")

    val (fruitName, fruitQuantity, isRipe) = tuple3 // Tuple3 destructuring
    println(s"Destructured Tuple3: Fruit = $fruitName, Quantity = $fruitQuantity, IsRipe = $isRipe")

    // Using tuples to return multiple values from a function
    val result = calculateTotalAndAverage(10, 20, 30)
    println(s"Result of calculation: Total = ${result._1}, Average = ${result._2}")
  }

  // Function that returns a tuple (example use case of tuples)
  def calculateTotalAndAverage(a: Int, b: Int, c: Int): (Int, Double) = {
    val total = a + b + c
    val average = total / 3.0
    (total, average) // Returning multiple values using a tuple
  }

  // ----------------------------------
  // Nested Tuples and Tuple Transformations
  // ----------------------------------

  def nestedTuples(): Unit = {
    // Nested tuple
    val nestedTuple: ((String, Int), (Boolean, Double)) = (("Apple", 5), (true, 3.14))

    println(s"Nested tuple: $nestedTuple")
    println(s"First part of the nested tuple: ${nestedTuple._1}")
    println(s"Second part of the nested tuple: ${nestedTuple._2}")

    // Accessing elements of nested tuple
    println(s"First element of first tuple: ${nestedTuple._1._1}")
    println(s"Second element of first tuple: ${nestedTuple._1._2}")
    println(s"First element of second tuple: ${nestedTuple._2._1}")
    println(s"Second element of second tuple: ${nestedTuple._2._2}")

    // Transforming a tuple (mapping over the elements)
    val tupleToTransform = ("Scala", 2024)
    val transformedTuple = tupleToTransform.copy(_2 = 2025) // Update second element
    println(s"Transformed tuple: $transformedTuple")
  }

  // Main method to execute the tuple operations
  def main(args: Array[String]): Unit = {
    println("----- Tuple Operations -----")
    tupleOperations()

    println("\n----- Nested Tuple Operations -----")
    nestedTuples()
  }
}
