package functionalprogramming

object FunctionalProgramming {

  /*

  Lists: map, flatMap, filter, reduce, fold, foreach, find, exists, forall, zip
  Maps: map, filter, flatMap, foreach, get, keys, values
  Sets: map, filter, flatMap, foreach, union, intersect, diff


  Explanation:


  List Operations:

  map: Transforms each element in the list using a function.
  flatMap: Applies a function that returns a List and flattens the result into a single list.
  filter: Selects elements that meet a condition.
  reduce: Combines elements using a binary operator.
  fold: Similar to reduce, but starts with an initial value.
  foreach: Applies a function to each element (typically for side effects).
  find: Finds the first element that matches a condition.
  exists: Checks if any element meets a condition.
  forall: Checks if all elements meet a condition.
  zip: Combines two lists into a list of tuples.


  Map Operations:

  map: Transforms each key-value pair in the map.
  filter: Keeps key-value pairs that meet a condition.
  flatMap: Applies a function that returns a collection and flattens the result.
  foreach: Applies a function to each key-value pair (typically for side effects).
  get: Retrieves the value associated with a key.
  keys: Returns all keys in the map.
  values: Returns all values in the map.
  Set Operations:

  map: Transforms each element in the set.
  filter: Keeps elements that meet a condition.
  flatMap: Applies a function that returns a Set and flattens the result.
  foreach: Applies a function to each element (typically for side effects).
  union: Combines two sets into one.
  intersect: Finds common elements between two sets.
  diff: Finds elements in one set that are not in another.
  Usage:
  Copy the code into a Scala environment and run it to see the functional operations in action.
  Each method demonstrates how to work with lists, maps, and sets using functional programming techniques, providing a clear understanding of how to manipulate these data structures effectively.
   */


  // ----------------------------------
  // 1. List Operations
  // ----------------------------------
  def listOperations(): Unit = {
    println("----- List Operations -----")

    val numbers = List(1, 2, 3, 4, 5)

    // map: Applies a function to each element
    val squared = numbers.map(x => x * x)
    println(s"Squared numbers: $squared")

    // flatMap: Applies a function that returns a List and flattens the result
    val nestedList = numbers.flatMap(x => List(x, x * 2))
    println(s"Nested List: $nestedList")

    // filter: Keeps only elements that satisfy a predicate
    val evenNumbers = numbers.filter(x => x % 2 == 0)
    println(s"Even numbers: $evenNumbers")

    // reduce: Combines elements using a binary operator
    val sum = numbers.reduce((x, y) => x + y)
    println(s"Sum of numbers: $sum")

    // fold: Similar to reduce but with an initial value
    val product = numbers.fold(1)((x, y) => x * y)
    println(s"Product of numbers: $product")

    // foreach: Applies a function to each element (side effect)
    println("Each number:")
    numbers.foreach(x => println(x))

    // find: Returns the first element that satisfies a predicate
    val firstEven = numbers.find(x => x % 2 == 0)
    println(s"First even number: $firstEven")

    // exists: Checks if any element satisfies a predicate
    val hasOdd = numbers.exists(x => x % 2 != 0)
    println(s"Contains odd numbers: $hasOdd")

    // forall: Checks if all elements satisfy a predicate
    val allPositive = numbers.forall(x => x > 0)
    println(s"All numbers positive: $allPositive")

    // zip: Combines two lists into a list of tuples
    val names = List("Alice", "Bob", "Charlie")
    val paired = numbers.zip(names)
    println(s"Zipped List: $paired")
  }

  // ----------------------------------
  // 2. Map Operations
  // ----------------------------------
  def mapOperations(): Unit = {
    println("\n----- Map Operations -----")

    val map = Map("a" -> 1, "b" -> 2, "c" -> 3)

    // map: Applies a function to each key-value pair
    val incrementedMap = map.map { case (key, value) => (key, value + 1) }
    println(s"Incremented Map: $incrementedMap")

    // filter: Keeps only key-value pairs that satisfy a predicate
    val filteredMap = map.filter { case (key, value) => value % 2 == 1 }
    println(s"Filtered Map (odd values): $filteredMap")

    // flatMap: Applies a function that returns a collection and flattens the result
    val flattenedMap = map.flatMap { case (key, value) => Seq((key, value), (key.toUpperCase, value + 1)) }
    println(s"Flattened Map: $flattenedMap")

    // foreach: Applies a function to each key-value pair (side effect)
    println("Map key-value pairs:")
    map.foreach { case (key, value) => println(s"$key -> $value") }

    // get: Retrieves the value for a given key
    val valueOfB = map.get("b")
    println(s"Value of key 'b': $valueOfB")

    // keys: Returns a collection of all keys
    val keys = map.keys
    println(s"Keys: $keys")

    // values: Returns a collection of all values
    val values = map.values
    println(s"Values: $values")
  }

  // ----------------------------------
  // 3. Set Operations
  // ----------------------------------
  def setOperations(): Unit = {
    println("\n----- Set Operations -----")

    val set = Set(1, 2, 3, 4, 5)

    // map: Applies a function to each element
    val doubledSet = set.map(x => x * 2)
    println(s"Doubled Set: $doubledSet")

    // filter: Keeps only elements that satisfy a predicate
    val evenSet = set.filter(x => x % 2 == 0)
    println(s"Even Set: $evenSet")

    // flatMap: Applies a function that returns a Set and flattens the result
    val flatMappedSet = set.flatMap(x => Set(x, x + 10))
    println(s"FlatMapped Set: $flatMappedSet")

    // foreach: Applies a function to each element (side effect)
    println("Set elements:")
    set.foreach(x => println(x))

    // union: Combines two sets into one
    val otherSet = Set(4, 5, 6, 7)
    val unionSet = set.union(otherSet)
    println(s"Union of Sets: $unionSet")

    // intersect: Returns elements common to both sets
    val intersectSet = set.intersect(otherSet)
    println(s"Intersection of Sets: $intersectSet")

    // diff: Returns elements in the set that are not in the other set
    val diffSet = set.diff(otherSet)
    println(s"Difference of Sets: $diffSet")
  }

  // ----------------------------------
  // Main method to execute all functional operations
  // ----------------------------------
  def main(args: Array[String]): Unit = {
    // Example 1: List operations
    listOperations()

    // Example 2: Map operations
    mapOperations()

    // Example 3: Set operations
    setOperations()
  }
}
