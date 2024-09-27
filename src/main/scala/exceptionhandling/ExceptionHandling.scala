package exceptionhandling

object ExceptionHandling {

  // Basic Exception Handling
  def basicExceptionHandling(): Unit = {
    println("\n--- Basic Exception Handling ---")
    try {
      val x = 10 / 0 // This will raise ArithmeticException
    } catch {
      case e: ArithmeticException =>
        println(s"Exception caught: ${e.getMessage}")
    } finally {
      println("Finally block executed")
    }
  }

  // Catching Multiple Exceptions
  def multipleExceptionHandling(): Unit = {
    println("\n--- Catching Multiple Exceptions ---")
    try {
      val arr = Array(1, 2, 3)
      println(arr(5)) // This will raise ArrayIndexOutOfBoundsException
    } catch {
      case e: ArrayIndexOutOfBoundsException =>
        println(s"Array Index Out Of Bounds Exception caught: ${e.getMessage}")
      case e: Exception =>
        println(s"General exception caught: ${e.getMessage}")
    } finally {
      println("Finally block executed")
    }
  }

  // User-defined Exception
  class InvalidAgeException(val age: Int, message: String = "Age is less than 18") extends Exception(message)

  def customExceptionHandling(age: Int): Unit = {
    println("\n--- User-defined Exception ---")
    try {
      if (age < 18) throw new InvalidAgeException(age)
      else println("Valid age!")
    } catch {
      case e: InvalidAgeException =>
        println(s"Custom exception caught: ${e.getMessage}")
    } finally {
      println("Finally block executed")
    }
  }

  // Using 'else' in Exception Handling
  def exceptionHandlingWithElse(a: Int, b: Int): Unit = {
    println("\n--- Exception Handling with Else ---")
    try {
      val result = a / b
      println(s"Division successful, result: $result")
    } catch {
      case e: ArithmeticException =>
        println(s"Exception caught: ${e.getMessage}")
    } finally {
      println("Finally block executed")
    }
  }

  // Suppressing Exceptions with 'pass' (similar concept using 'catch' block in Scala)
  def suppressingExceptions(): Unit = {
    println("\n--- Suppressing Exceptions ---")
    try {
      val x = 10 / 0 // This will raise ArithmeticException
    } catch {
      case _: ArithmeticException =>
      // Suppress the exception (do nothing)
    } finally {
      println("Finally block executed")
    }
  }

  // Using 'finally' for Resource Cleanup
  def usingFinallyForCleanup(): Unit = {
    println("\n--- Using 'finally' for Resource Cleanup ---")

    try {
      val source = scala.io.Source.fromFile("sample.txt")
      val lines = source.getLines().mkString("\n")
      println("File read successfully!")
    } catch {
      case e: java.io.FileNotFoundException =>
        println(s"Exception caught: ${e.getMessage}")
    } finally {
      //source.close()
      println("File resource closed.")
    }
  }

  // Main function to execute all scenarios
  def main(args: Array[String]): Unit = {
    basicExceptionHandling()
    multipleExceptionHandling()
    customExceptionHandling(15)
    exceptionHandlingWithElse(10, 2)
    exceptionHandlingWithElse(10, 0)
    suppressingExceptions()
    usingFinallyForCleanup()
  }

}
