package basicdatastructures

object StringOperations {

  /*
  Immutable String (String):

  Strings in Scala are immutable, so any modification (like concatenation, replacement, etc.) will result in a new string being created, leaving the original string unchanged.
  Common operations such as accessing characters, concatenation, replacement, substring, case conversion, splitting, and length are demonstrated.
  Mutable String (StringBuilder):

  For mutable strings, Scala uses StringBuilder. This allows you to modify the string in place (append, insert, delete, replace, etc.) without creating new strings.
  append, insert, delete, replace, reverse, and clear methods are shown for manipulating the string.
  Main Method:

  The main method demonstrates both immutable and mutable string operations by calling the appropriate functions.
  Usage:
  Copy the code into a Scala environment, and run it. It will show the output for both immutable and mutable string operations.
   */



  // ----------------------------------
  // Immutable String Operations
  // ----------------------------------

  // Immutable String (Scala's String is immutable by default, just like in Java)
  val immutableString: String = "Hello, Scala!"

  def immutableStringOperations(): Unit = {
    println(s"Original immutable string: $immutableString")

    // Accessing characters
    println(s"First character: ${immutableString.head}")
    println(s"Last character: ${immutableString.last}")
    println(s"Character at index 4: ${immutableString.charAt(4)}")

    // String concatenation (creates a new string)
    val concatenatedString = immutableString + " Welcome to immutable strings."
    println(s"Concatenated string: $concatenatedString")

    // String replacement (creates a new string)
    val replacedString = immutableString.replace("Scala", "World")
    println(s"String after replacement: $replacedString")

    // Substring extraction
    val substring = immutableString.substring(0, 5) // Extracts "Hello"
    println(s"Substring (0 to 5): $substring")

    // Converting to uppercase
    val upperCaseString = immutableString.toUpperCase
    println(s"Uppercase string: $upperCaseString")

    // Splitting the string
    val splitString = immutableString.split(" ")
    println(s"Split string: ${splitString.mkString(", ")}") // Converts array back to string for printing

    // Length of the string
    val lengthOfString = immutableString.length
    println(s"Length of the string: $lengthOfString")
  }

  // ----------------------------------
  // Mutable String Operations using StringBuilder
  // ----------------------------------

  // Mutable StringBuilder for mutable string operations
  val mutableStringBuilder: StringBuilder = new StringBuilder("Hello, Scala!")

  def mutableStringOperations(): Unit = {
    println(s"Original mutable string: $mutableStringBuilder")

    // Appending to mutable string
    mutableStringBuilder.append(" Welcome to mutable strings.")
    println(s"Mutable string after append: $mutableStringBuilder")

    // Inserting into mutable string
    mutableStringBuilder.insert(7, "Mutable ") // Inserts "Mutable " at index 7
    println(s"Mutable string after insert: $mutableStringBuilder")

    // Deleting from mutable string
    mutableStringBuilder.delete(7, 15) // Removes "Mutable " (from index 7 to 14)
    println(s"Mutable string after delete: $mutableStringBuilder")

    // Replacing part of the string
    mutableStringBuilder.replace(0, 5, "Hi") // Replaces "Hello" with "Hi"
    println(s"Mutable string after replace: $mutableStringBuilder")

    // Reversing the string
    mutableStringBuilder.reverse
    println(s"Mutable string after reverse: $mutableStringBuilder")

    // Clearing the mutable string
    mutableStringBuilder.clear()
    println(s"Mutable string after clearing: $mutableStringBuilder")
  }

  // Main method to execute the operations
  def main(args: Array[String]): Unit = {
    println("----- Immutable String Operations -----")
    immutableStringOperations()

    println("\n----- Mutable String Operations (StringBuilder) -----")
    mutableStringOperations()
  }

}
