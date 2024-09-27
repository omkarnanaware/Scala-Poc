package basicdatastructures

object SetOperations {
  // Define a set (unordered collection of unique elements)
  val mySet: Set[Int] = Set(1, 2, 3, 4, 5, 5, 6) // Duplicates are automatically removed
  println(s"Original Set: $mySet")

  // Creating a set from a sequence (duplicates are removed)
  val listVal: List[Int] = List(1, 2, 3, 4, 4, 5)
  val setFromList: Set[Int] = listVal.toSet
  println(s"Set from List (duplicates removed): $setFromList")

  // Common Set Functions

  // Adding an element to a set (creates a new set since sets are immutable in Scala)
  val setWithAddedElement = mySet + 7
  println(s"Set after adding 7: $setWithAddedElement")

  // Removing an element from a set (creates a new set as Scala sets are immutable)
  val setWithRemovedElement = mySet - 3
  println(s"Set after removing 3: $setWithRemovedElement")

  // Checking if an element exists in a set using 'contains'
  println(s"Is 2 in the set? ${mySet.contains(2)}")

  // Set Union (all unique elements from both sets)
  val anotherSet: Set[Int] = Set(5, 6, 7, 8, 9)
  val unionSet = mySet union anotherSet
  println(s"Union of sets: $unionSet")

  // Set Intersection (common elements between sets)
  val intersectionSet = mySet intersect anotherSet
  println(s"Intersection of sets: $intersectionSet")

  // Set Difference (elements present in mySet but not in anotherSet)
  val differenceSet = mySet diff anotherSet
  println(s"Difference between sets (mySet - anotherSet): $differenceSet")

  // Set Symmetric Difference (elements in either set but not in both)
  val symmetricDifferenceSet = (mySet union anotherSet) diff (mySet intersect anotherSet)
  println(s"Symmetric Difference of sets: $symmetricDifferenceSet")

  // Subset and Superset
  val smallSet: Set[Int] = Set(1, 2)
  println(s"Is smallSet a subset of mySet? ${smallSet.subsetOf(mySet)}")
  println(s"Is mySet a superset of smallSet? ${mySet.subsetOf(smallSet)}")

  // Set Comprehension
  // Creating a set with squares of numbers from 1 to 10
  val squaresSet: Set[Int] = (1 to 10).map(x => x * x).toSet
  println(s"Set Comprehension (squares of numbers from 1 to 10): $squaresSet")

  // Set Comprehension with condition
  // Creating a set of even numbers from 1 to 10
  val evenSet: Set[Int] = (1 to 10).filter(_ % 2 == 0).toSet
  println(s"Set Comprehension (even numbers from 1 to 10): $evenSet")

  def main(args: Array[String]): Unit = {
    // Main method to run the demo
  }

}
