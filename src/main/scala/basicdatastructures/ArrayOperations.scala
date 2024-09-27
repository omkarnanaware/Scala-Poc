package basicdatastructures

object ArrayOperations {

  // Creating an Array
  def createArray(): Unit = {
    // An array is a fixed-size data structure that stores elements of the same type.
    // In this example, we create an array of integers.
    val arr = Array(1, 2, 3, 4, 5)  // Array of integers
    println(s"Created Array: ${arr.mkString(", ")}")
    // mkString is used to create a string from the array elements, separated by a comma.
  }

  // Accessing elements in an Array
  def accessElements(): Unit = {
    // You can access elements of an array using index notation. Index starts at 0.
    val arr = Array("Scala", "Java", "Python")  // Array of strings
    println(s"First Element: ${arr(0)}")  // Accessing the first element, "Scala"
    println(s"Last Element: ${arr(arr.length - 1)}")  // Accessing the last element, "Python"
    // arr.length gives the total number of elements in the array.
  }

  // Modifying elements in an Array
  def modifyArray(): Unit = {
    // Arrays in Scala are mutable, meaning you can change their elements.
    val arr = Array(10, 20, 30, 40, 50)  // Array of integers
    arr(2) = 35  // Modifying the 3rd element (index 2) from 30 to 35
    println(s"Modified Array: ${arr.mkString(", ")}")
    // mkString is again used to display the modified array.
  }

  // Looping through an Array
  def loopArray(): Unit = {
    // You can use a 'for' loop to iterate through the array elements.
    val arr = Array("Red", "Green", "Blue")  // Array of colors
    for (color <- arr) {
      println(s"Color: $color")  // Prints each color in the array
    }
    // The 'for' loop assigns each element to the variable 'color' and iterates over the array.
  }

  // Filtering elements in an Array
  def filterArray(): Unit = {
    // The filter method is used to select elements that satisfy a given condition.
    val arr = Array(5, 10, 15, 20, 25, 30)  // Array of integers
    val filteredArr = arr.filter(_ > 15)  // Filters elements greater than 15
    println(s"Filtered Array (elements > 15): ${filteredArr.mkString(", ")}")
    // The underscore (_) represents each element in the array, and only those greater than 15 are kept.
  }

  // Mapping elements in an Array
  def mapArray(): Unit = {
    // The map function applies a transformation to each element in the array.
    val arr = Array(1, 2, 3, 4, 5)  // Array of integers
    val mappedArr = arr.map(_ * 2)  // Multiplies each element by 2
    println(s"Mapped Array (each element * 2): ${mappedArr.mkString(", ")}")
    // This creates a new array with the elements multiplied by 2.
  }

  // Reducing elements in an Array
  def reduceArray(): Unit = {
    // The reduce method combines all the elements of an array into a single value, based on a specified operation.
    val arr = Array(10, 20, 30, 40)  // Array of integers
    val sum = arr.reduce(_ + _)  // Sums all elements in the array
    println(s"Sum of elements in Array: $sum")
    // The reduce method takes two elements at a time and applies the operation (here, addition) until one value remains.
  }

  // Sorting an Array
  def sortArray(): Unit = {
    // Sorting can be done using the sorted method, which returns a new array with elements in ascending order.
    val arr = Array(40, 10, 50, 30, 20)  // Array of integers
    val sortedArr = arr.sorted  // Sorts the array in ascending order
    println(s"Sorted Array: ${sortedArr.mkString(", ")}")
    // The sorted method arranges the elements in increasing order.
  }

  // Concatenating Arrays
  def concatArray(): Unit = {
    // You can concatenate two arrays using the ++ operator, which combines them into a new array.
    val arr1 = Array(1, 2, 3)  // First array
    val arr2 = Array(4, 5, 6)  // Second array
    val concatenatedArr = arr1 ++ arr2  // Concatenating arr1 and arr2
    println(s"Concatenated Array: ${concatenatedArr.mkString(", ")}")
    // The concatenated array contains all elements from arr1 followed by all elements from arr2.
  }

  // Main function to execute all the array functions
  def main(args: Array[String]): Unit = {
    // Calling each function to demonstrate array operations
    createArray()  // Create and display an array
    accessElements()  // Access specific elements in the array
    modifyArray()  // Modify elements in the array
    loopArray()  // Loop through and print elements of the array
    filterArray()  // Filter elements based on a condition
    mapArray()  // Map elements to a new array by applying a transformation
    reduceArray()  // Reduce array elements to a single value (sum)
    sortArray()  // Sort array elements in ascending order
    concatArray()  // Concatenate two arrays
  }
}
