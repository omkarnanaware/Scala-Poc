import scala.collection.mutable.ListBuffer

object ListOperations {

  /*
  Immutable List:

  immutableList is an immutable list. Once defined, the list cannot be modified. Any modification creates a new list.
  Methods like head, tail, :+, ::, and ++ are used for accessing, appending, prepending, and concatenating immutable lists.
  Mutable ListBuffer:

  mutableListBuffer is a mutable collection that allows adding, removing, and updating elements.
  Methods like +=, ++=, prepend, -=, clear, and direct element assignment (e.g., mutableListBuffer(0) = 100) are used to modify the list in place.
  Conversions:

  You can convert between mutable and immutable lists easily using .toList for converting a ListBuffer to List, and ListBuffer(immutableList: _*) for converting a List to ListBuffer.
  Main Method:

  The main method demonstrates the various operations. This can be executed to observe how immutable and mutable lists behave in Scala.
  Usage:
  You can copy this code into a Scala environment, and when you run it, it will execute the operations and print the results of each operation for both mutable and immutable lists.
   */


  // Immutable List creation
  // Immutable lists are fixed once defined; you cannot modify the original list.
  val immutableList = List(1,2,3,4,5)
  val anotherImmutableList = List(6, 7, 8)

  // Mutable ListBuffer creation
  // Mutable ListBuffer can be modified after creation (add, remove elements, etc.)
  val mutableListBuffer: ListBuffer[Int] = ListBuffer(10, 20, 30, 40)

  // ----------------------------------
  // Immutable List Operations
  // ----------------------------------

  def immutableListOperations(): Unit = {

    val immutableList = List(1, 2, 3, 4, 5)
    val anotherImmutableList = List(6, 7, 8)

    // Access elements
    println(s"First element of immutableList: ${immutableList.head}")
    println(s"Rest of the elements of immutableList: ${immutableList.tail}")

    // Adding elements:
    // Adding elements to immutable list creates a new list,
    // since the original list cannot be modified.
    val newImmutableList = immutableList :+ 6  // Append element to the end
    println(s"New immutable list after append: $newImmutableList")

    // Prepending an element
    val prependedList = 0 :: immutableList
    println(s"List after prepending 0: $prependedList")

    // Concatenating two lists
    val concatenatedList = immutableList ++ anotherImmutableList
    println(s"Concatenated immutable lists: $concatenatedList")

    // Filtering elements
    val filteredList = immutableList.filter(_ % 2 == 0)  // Keep only even numbers
    println(s"Filtered list (only even numbers): $filteredList")

    // Mapping elements
    val mappedList = immutableList.map(_ * 2)  // Multiply each element by 2
    println(s"Mapped list (each element * 2): $mappedList")

    // Reduce operation: Sum all elements in the list
    val sumOfElements = immutableList.reduce(_ + _)
    println(s"Sum of all elements in the immutable list: $sumOfElements")

    // Finding an element
    val firstEven = immutableList.find(_ % 2 == 0)  // Finds the first even number
    println(s"First even number in immutable list: $firstEven")
  }

  // ----------------------------------
  // Mutable ListBuffer Operations
  // ----------------------------------

  def mutableListBufferOperations(): Unit = {

    // Accessing elements
    println(s"First element of mutableListBuffer: ${mutableListBuffer.head}")

    // Adding elements
    mutableListBuffer += 50  // Add a single element to the mutable list buffer
    println(s"Mutable ListBuffer after adding 50: $mutableListBuffer")

    mutableListBuffer ++= Seq(60, 70)  // Add multiple elements
    println(s"Mutable ListBuffer after adding 60 and 70: $mutableListBuffer")

    // Prepending elements
    mutableListBuffer.prepend(5)
    println(s"Mutable ListBuffer after prepending 5: $mutableListBuffer")

    // Removing elements
    mutableListBuffer -= 10  // Remove element 10 from the list
    println(s"Mutable ListBuffer after removing 10: $mutableListBuffer")

    mutableListBuffer --= Seq(20, 30)  // Remove multiple elements
    println(s"Mutable ListBuffer after removing 20 and 30: $mutableListBuffer")

    // Updating an element at a specific index
    mutableListBuffer(0) = 100  // Update the first element
    println(s"Mutable ListBuffer after updating first element to 100: $mutableListBuffer")

    // Clearing all elements
    mutableListBuffer.clear()
    println(s"Mutable ListBuffer after clearing all elements: $mutableListBuffer")
  }

  // ----------------------------------
  // Converting between mutable and immutable lists
  // ----------------------------------

  def conversionBetweenLists(): Unit = {
    // Converting mutable ListBuffer to immutable List
    val immutableFromMutable: List[Int] = mutableListBuffer.toList
    println(s"Immutable list created from mutable ListBuffer: $immutableFromMutable")

    // Converting immutable List to mutable ListBuffer
    val mutableFromImmutable: ListBuffer[Int] = ListBuffer(immutableList: _*)
    println(s"Mutable ListBuffer created from immutable list: $mutableFromImmutable")
  }

  // Main method to execute the operations
  def main(args: Array[String]): Unit = {
    println("----- Immutable List Operations -----")
    immutableListOperations()

    println("\n----- Mutable ListBuffer Operations -----")
    mutableListBufferOperations()

    println("\n----- Conversion between Lists -----")
    conversionBetweenLists()
  }
}