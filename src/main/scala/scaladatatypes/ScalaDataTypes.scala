// Define the object to demonstrate Scala datatypes and casting
object ScalaDataTypes {

  // Byte: 8-bit signed integer. Range: -128 to 127
  val byteVal: Byte = 10

  // Short: 16-bit signed integer. Range: -32,768 to 32,767
  val shortVal: Short = 1000

  // Int: 32-bit signed integer. Commonly used for integer operations. Range: -2^31 to 2^31-1
  val intVal: Int = 50000

  // Long: 64-bit signed integer. Range: -2^63 to 2^63-1
  val longVal: Long = 10000000000L

  // Float: 32-bit floating-point number, used for fractional values
  val floatVal: Float = 10.5F

  // Double: 64-bit floating-point number, more precision than Float
  val doubleVal: Double = 20.99

  // Char: 16-bit unsigned Unicode character. Stores a single character.
  val charVal: Char = 'A'

  // String: Immutable sequence of characters
  val stringVal: String = "Hello, Scala!"

  // Boolean: Stores true or false values
  val booleanVal: Boolean = true

  // Unit: Used for methods that don't return anything (similar to void in other languages)
  def unitMethod(): Unit = {
    println("This method returns Unit")
  }

  // Null: A reference to indicate an absence of value for a reference type (not applicable for value types like Int, Float, etc.)
  val nullVal: String = null

  // Nothing: Subtype of all types; typically used to indicate abnormal termination (exceptions)
  def nothingMethod(): Nothing = {
    throw new Exception("This method returns Nothing")
  }

  // Any: The supertype of all types. Any can hold any type of value.
  val anyVal: Any = "This could be any type"

  // AnyVal: The supertype of all value types (Byte, Short, Int, Long, Float, Double, Char, Boolean, Unit)
  val anyValType: AnyVal = 42

  // AnyRef: The supertype of all reference types (e.g., String, custom objects)
  val anyRefType: AnyRef = "Reference Type Example"

  // Demonstrating type casting in Scala

  // Upcasting (automatic widening conversion)
  // Int to Long
  val castedLong: Long = intVal

  // Downcasting (requires explicit conversion)
  // Double to Int
  val castedInt: Int = doubleVal.toInt // Decimal part will be truncated

  // String to Int
  val stringToInt: Int = "123".toInt // If the string is not numeric, this will throw an exception

  // Demonstrating implicit and explicit type conversions

  // Implicit Conversion (widening)
  val implicitConversion: Double = intVal // Int is automatically promoted to Double

  // Explicit Conversion (narrowing)
  val explicitConversion: Int = floatVal.toInt // Float to Int, truncating fractional part

  // Casting in collections
  val intList: List[Int] = List(1, 2, 3, 4)
  val anyList: List[Any] = intList.map(_.toString) // Convert each element to String and store in a List of Any

  // Option, Some, None for handling null safely
  val someVal: Option[Int] = Some(10) // A value is present
  val noneVal: Option[Int] = None // No value present

  // Main method to demonstrate usage of variables and casting
  def main(args: Array[String]): Unit = {
    // Calling a method returning Unit
    unitMethod()

    // Accessing variables
    println(s"Byte Value: $byteVal")
    println(s"Double Value: $doubleVal")
    println(s"Boolean Value: $booleanVal")
    println(s"Any Value: $anyVal")

    // Demonstrating casting
    println(s"Original Int: $intVal, Casted Long: $castedLong")
    println(s"Original Double: $doubleVal, Casted Int (truncated): $castedInt")
    println(s"String to Int: $stringToInt")

    // Demonstrating collections casting
    println(s"Casted List to Any: $anyList")

    // Demonstrating Option usage
    println(s"Some Value: ${someVal.getOrElse("No value")}")
    println(s"None Value: ${noneVal.getOrElse("No value")}")
  }
}