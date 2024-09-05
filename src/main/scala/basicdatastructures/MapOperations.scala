package basicdatastructures

import scala.collection.mutable

object MapOperations {


  /*
  Immutable Map:

  Immutable maps in Scala are defined using Map.
  Operations like adding, removing, or updating key-value pairs create new maps and leave the original map unchanged.
  Example operations: +, -, contains, foreach, and accessing elements with map(key).
  Mutable Map:

  Mutable maps are created using scala.collection.mutable.Map.
  You can directly modify the map using methods like +=, -=, updating values using map(key) = newValue, and clearing the map using clear().
  Example operations: +=, -=, update, clear, and foreach.
  Conversion between Mutable and Immutable Maps:

  Use toMap to convert a mutable map to an immutable one.
  Convert an immutable map to a mutable map using mutable.Map(immutableMap.toSeq: _*).
  Main Method:

  The main method runs the operations for both immutable and mutable maps, demonstrating the functionality.
  Usage:
  Copy the code into a Scala environment, and run it. It will demonstrate the operations on both immutable and mutable maps. You’ll see how the operations differ between the two types of maps, and how conversions work.
   */

  // ----------------------------------
  // Immutable Map Operations
  // ----------------------------------

  // Immutable Map (Scala's Map is immutable by default)
  val immutableMap: Map[String, Int] = Map("Apple" -> 3, "Banana" -> 5, "Orange" -> 2)

  def immutableMapOperations(): Unit = {
    println(s"Original immutable map: $immutableMap")

    // Accessing elements by key
    println(s"Value for key 'Apple': ${immutableMap("Apple")}")

    // Adding a new key-value pair (creates a new map)
    val updatedMap = immutableMap + ("Grapes" -> 4)
    println(s"Immutable map after adding Grapes: $updatedMap")

    // Removing a key-value pair (creates a new map)
    val mapAfterRemoval = immutableMap - "Banana"
    println(s"Immutable map after removing Banana: $mapAfterRemoval")

    // Updating a value (creates a new map)
    val mapAfterUpdate = immutableMap + ("Orange" -> 10)
    println(s"Immutable map after updating Orange's value: $mapAfterUpdate")

    // Checking if a key exists
    println(s"Contains key 'Apple': ${immutableMap.contains("Apple")}")
    println(s"Contains key 'Mango': ${immutableMap.contains("Mango")}")

    // Iterating over key-value pairs
    println("Iterating over immutable map:")
    immutableMap.foreach { case (key, value) => println(s"Key: $key, Value: $value") }
  }

  // ----------------------------------
  // Mutable Map Operations
  // ----------------------------------

  // Mutable Map
  val mutableMap: mutable.Map[String, Int] = mutable.Map("Apple" -> 3, "Banana" -> 5, "Orange" -> 2)

  def mutableMapOperations(): Unit = {
    println(s"Original mutable map: $mutableMap")

    // Accessing elements by key
    println(s"Value for key 'Apple': ${mutableMap("Apple")}")

    // Adding a new key-value pair (modifies the original map)
    mutableMap += ("Grapes" -> 4)
    println(s"Mutable map after adding Grapes: $mutableMap")

    // Removing a key-value pair (modifies the original map)
    mutableMap -= "Banana"
    println(s"Mutable map after removing Banana: $mutableMap")

    // Updating a value (modifies the original map)
    mutableMap("Orange") = 10
    println(s"Mutable map after updating Orange's value: $mutableMap")

    // Checking if a key exists
    println(s"Contains key 'Apple': ${mutableMap.contains("Apple")}")
    println(s"Contains key 'Mango': ${mutableMap.contains("Mango")}")

    // Iterating over key-value pairs
    println("Iterating over mutable map:")
    mutableMap.foreach { case (key, value) => println(s"Key: $key, Value: $value") }

    // Clearing the map
    mutableMap.clear()
    println(s"Mutable map after clearing: $mutableMap")
  }

  // ----------------------------------
  // Conversion between Mutable and Immutable Maps
  // ----------------------------------

  def conversionBetweenMaps(): Unit = {
    // Converting mutable map to immutable map
    val immutableFromMutable: Map[String, Int] = mutableMap.toMap
    println(s"Immutable map created from mutable map: $immutableFromMutable")

    // Converting immutable map to mutable map
    val mutableFromImmutable: mutable.Map[String, Int] = mutable.Map(immutableMap.toSeq: _*)
    println(s"Mutable map created from immutable map: $mutableFromImmutable")
  }

  // Main method to execute the operations
  def main(args: Array[String]): Unit = {
    println("----- Immutable Map Operations -----")
    immutableMapOperations()

    println("\n----- Mutable Map Operations -----")
    mutableMapOperations()

    println("\n----- Conversion between Maps -----")
    conversionBetweenMaps()
  }

}
