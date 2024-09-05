package conditionaloperations

object ConditionalOperations {

  /*
  if-else: Basic conditional branching.
  if-else if-else: Multiple conditions.
  nested if: Conditions within conditions.
  match-case: Similar to switch in other languages.
  pattern matching with guards: Using conditions within match-case.
  for-loop with if (guard): Conditional filtering in loops.
   */


  // ----------------------------------
  // 1. if-else Statement
  // ----------------------------------
  def checkPositiveOrNegative(number: Int): Unit = {
    if (number > 0) {
      println(s"$number is positive")
    } else {
      println(s"$number is negative or zero")
    }
  }

  // ----------------------------------
  // 2. if-else if-else Statement
  // ----------------------------------
  def gradeEvaluator(marks: Int): Unit = {
    if (marks >= 90) {
      println("Grade: A")
    } else if (marks >= 80) {
      println("Grade: B")
    } else if (marks >= 70) {
      println("Grade: C")
    } else if (marks >= 60) {
      println("Grade: D")
    } else {
      println("Grade: F")
    }
  }

  // ----------------------------------
  // 3. Nested if Statement
  // ----------------------------------
  def nestedIfExample(a: Int, b: Int): Unit = {
    if (a > 0) {
      if (b > 0) {
        println(s"Both $a and $b are positive")
      } else {
        println(s"$a is positive but $b is not positive")
      }
    } else {
      println(s"$a is not positive")
    }
  }

  // ----------------------------------
  // 4. match-case Statement
  // ----------------------------------
  def matchCaseExample(day: String): Unit = {
    day.toLowerCase match {
      case "monday" => println("Start of the work week")
      case "tuesday" => println("Second day of the week")
      case "wednesday" => println("Midweek")
      case "thursday" => println("Almost there")
      case "friday" => println("Last working day")
      case "saturday" => println("Weekend!")
      case "sunday" => println("Relax, it's the weekend")
      case _ => println("Invalid day")
    }
  }

  // ----------------------------------
  // 5. Pattern Matching with Guards
  // ----------------------------------
  def matchWithGuards(number: Int): Unit = {
    number match {
      case x if x > 0 => println(s"$x is a positive number")
      case x if x < 0 => println(s"$x is a negative number")
      case 0 => println("It's zero")
      case _ => println("Not a valid number")
    }
  }

  // ----------------------------------
  // 6. for-loop with if (guard)
  // ----------------------------------
  def filterEvenNumbers(numbers: List[Int]): Unit = {
    for (n <- numbers if n % 2 == 0) {
      println(s"Even number: $n")
    }
  }

  // ----------------------------------
  // Main method to execute all conditional statements
  // ----------------------------------
  def main(args: Array[String]): Unit = {
    // Example 1: if-else
    println("----- if-else Example -----")
    checkPositiveOrNegative(10)
    checkPositiveOrNegative(-5)

    // Example 2: if-else if-else
    println("\n----- if-else if-else Example -----")
    gradeEvaluator(85)
    gradeEvaluator(50)

    // Example 3: Nested if
    println("\n----- Nested if Example -----")
    nestedIfExample(5, -3)
    nestedIfExample(7, 2)

    // Example 4: match-case
    println("\n----- match-case Example -----")
    matchCaseExample("Monday")
    matchCaseExample("Sunday")

    // Example 5: Pattern matching with guards
    println("\n----- match-case with Guards Example -----")
    matchWithGuards(5)
    matchWithGuards(-2)
    matchWithGuards(0)

    // Example 6: for-loop with if (guard)
    println("\n----- for-loop with Guard Example -----")
    filterEvenNumbers(List(1, 2, 3, 4, 5, 6))
  }

}
