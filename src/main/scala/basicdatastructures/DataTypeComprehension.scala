package basicdatastructures

object DataTypeComprehension {

  /*
  Byte, Short, Int, Long, Float, Double:

  Each numeric type (Byte, Short, Int, Long, Float, Double) has a list (List[Byte], List[Int], etc.) initialized with values.
  A comprehension is used via .map() to apply an operation to all elements of the list. For example, multiplying each value by 2.
  Char:

  A list of characters (List[Char]) is used, and .map() converts each character to uppercase.
  String:

  A list of strings (List[String]) is created, and .map() converts each string to uppercase.
  Boolean:

  A list of booleans (List[Boolean]) is negated using the ! operator in the comprehension.
  Unit:

  A method unitFunction() is created, demonstrating a function that returns Unit, which is used when no value is returned.
  Null:

  A null value is assigned to a string, showing its use with reference types.
  Nothing:

  A method nothingFunction() throws an exception and demonstrates the use of Nothing, which indicates abnormal termination (e.g., exceptions).
  Any, AnyVal, AnyRef:

  Any: Demonstrates how any type can be used in Scala. The comprehension converts each element of mixed types to a string.
  AnyVal: Works for all value types (e.g., Int, Double), demonstrating that value types can be handled generically.
  AnyRef: Handles reference types and applies transformations (such as .toString()).
   */


  // Byte: 8-bit signed integer. Range: -128 to 127.
  val byteList: List[Byte] = List(1, 2, 3, 4, 5) // Comprehension for a list of Bytes
  val byteComprehension: List[Byte] = byteList.map( x => {var a = x*2; a.toByte }) // Doubling each Byte
  println(s"Byte Comprehension (doubling values): $byteComprehension")

  // Short: 16-bit signed integer. Range: -32,768 to 32,767.
  val shortList: List[Short] = List(1000, 2000, 3000)
  val shortComprehension: List[Short] = shortList.map(x => {var a = x*2; a.toShort}) // Doubling each Short
  println(s"Short Comprehension (doubling values): $shortComprehension")

  // Int: 32-bit signed integer. Common integer type in Scala.
  val intList: List[Int] = List(1, 2, 3, 4, 5)
  val intComprehension: List[Int] = intList.map(_ * 2) // Doubling each Int
  println(s"Int Comprehension (doubling values): $intComprehension")

  // Long: 64-bit signed integer. Range: -2^63 to 2^63-1.
  val longList: List[Long] = List(1000000L, 2000000L, 3000000L)
  val longComprehension: List[Long] = longList.map(_ * 2)
  println(s"Long Comprehension (doubling values): $longComprehension")

  // Float: 32-bit floating-point number.
  val floatList: List[Float] = List(1.5F, 2.5F, 3.5F)
  val floatComprehension: List[Float] = floatList.map(_ * 2)
  println(s"Float Comprehension (doubling values): $floatComprehension")

  // Double: 64-bit floating-point number, higher precision than Float.
  val doubleList: List[Double] = List(1.5, 2.5, 3.5)
  val doubleComprehension: List[Double] = doubleList.map(_ * 2)
  println(s"Double Comprehension (doubling values): $doubleComprehension")

  // Char: Represents a single character, 16-bit unsigned.
  val charList: List[Char] = List('a', 'b', 'c')
  val charComprehension: List[Char] = charList.map(_.toUpper)
  println(s"Char Comprehension (toUpperCase): $charComprehension")

  // String: Immutable sequence of characters.
  val stringList: List[String] = List("Scala", "Data", "Types")
  val stringComprehension: List[String] = stringList.map(_.toUpperCase)
  println(s"String Comprehension (toUpperCase): $stringComprehension")

  // Boolean: Represents true or false.
  val booleanList: List[Boolean] = List(true, false, true)
  val booleanComprehension: List[Boolean] = booleanList.map(!_) // Negating each boolean
  println(s"Boolean Comprehension (negating values): $booleanComprehension")

  // Unit: Represents no value (similar to void in other languages).
  // Typically, Unit is used as a return type in functions that don't return a value.
  def unitFunction(): Unit = {
    println("This function returns Unit (no value)")
  }

  unitFunction() // Demonstrating Unit usage

  // Null: Represents a null reference for objects. Typically used for reference types.
  val nullValue: String = null
  println(s"Null Value: $nullValue")

  // Nothing: Represents no return value, typically used for throwing exceptions.
  def nothingFunction(): Nothing = {
    throw new Exception("This function returns Nothing by throwing an exception")
  }
  // nothingFunction()  // Uncommenting this will terminate the program by throwing an exception

  // Any: The supertype of all types in Scala.
  val anyList: List[Any] = List(1, "Scala", true, 1.5)
  val anyComprehension: List[String] = anyList.map(_.toString) // Converting all to String
  println(s"Any Comprehension (convert to String): $anyComprehension")

  // AnyVal: Supertype of all value types (e.g., Int, Double, etc.)
  val anyValList: List[AnyVal] = List(1, 2.5, 'c', true)
  val anyValComprehension: List[String] = anyValList.map(_.toString) // Converting value types to String
  println(s"AnyVal Comprehension (convert to String): $anyValComprehension")

  // AnyRef: Supertype of all reference types (e.g., String, custom objects).
  val anyRefList: List[AnyRef] = List("Scala", new Object())
  val anyRefComprehension: List[String] = anyRefList.map(_.toString) // Converting reference types to String
  println(s"AnyRef Comprehension (convert to String): $anyRefComprehension")

  def main(args: Array[String]): Unit = {
    // Main method to run all the comprehensions and functions
  }

}
