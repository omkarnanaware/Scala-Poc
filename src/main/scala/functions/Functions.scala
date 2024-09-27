package functions

object Functions {

  def main(args:Array[String]):Unit = {




    // Normal Function


    /*
  Defining a Basic Function
  In Scala, you define a basic function using the def keyword. You must specify the function name, its parameters, return type, and the function body.

  def functionName(parameter1: Type1, parameter2: Type2, ...): ReturnType = {
    // Function body
  }

   */

    def addBasic(a: Int, b: Int): Int = {
      a + b
    }

    println(addBasic(3, 5)) // Output: 8

    //In this example, the function add takes two parameters of type Int and returns their sum. The return type Int is explicitly declared.

    /*
  Function with Inferred Return Type
  Scala can infer the return type of a function based on the expression in the function body, so you can omit the return type.
   */

    def multiply(a: Int, b: Int) = a * b

    println(multiply(4, 5)) // Output: 20


    /*
  Function with No Parameters
 You can define a function that takes no parameters. If the function doesn't return a meaningful value, it can have the return type Unit.
   */

    def greetNoParameter(): Unit = {
      println("Hello, Scala!")
    }

    greetNoParameter() // Output: Hello, Scala!

    //Here, greet doesn't take any arguments and doesn't return any value (hence, return type Unit).

    /*
  Single Expression Functions (Syntactic Sugar)
  For functions with a single expression, you can omit the curly braces {}.
   */

    def square(x: Int): Int = x * x

    println(square(5)) // Output: 25


    /*
  Anonymous Functions (Lambdas)
  Scala allows the creation of anonymous functions (functions without a name). These are defined using the => symbol, which separates the parameters from the function body.

Syntax
  (parameters) => expression

   */


    val addAnonymous = (a: Int, b: Int) => a + b

    println(addAnonymous(3, 4)) // Output: 7


    /*
  Higher-Order Functions
  Higher-order functions are functions that take other functions as parameters or return functions as results.
   */

    def applyFunction(f: Int => Int, x: Int): Int = f(x)

    def increment(a: Int): Int = a + 1

    println(applyFunction(increment, 5)) // Output: 6

    //In this example, applyFunction is a higher-order function that takes another function f and applies it to the value x.

    /*
  Partially Applied Functions
  A partially applied function is one where you apply only some of the parameters, leaving the rest to be filled later.
   */

    def add(a: Int, b: Int, c: Int): Int = a + b + c

    val addFive = add(5, _: Int, _: Int)

    println(addFive(3, 2)) // Output: 10

    //Here, addFive is a partially applied function where the first parameter is fixed as 5, and the other two parameters are provided later.

    /*
  Curried Functions
  A curried function is a function that takes multiple arguments one at a time by returning a series of functions, each with one argument.
   */

    def multiplyCurried(a: Int)(b: Int): Int = a * b

    val multiplyBy2 = multiplyCurried(2) _

    println(multiplyBy2(3)) // Output: 6


    //In this case, multiply is a curried function that takes a first and then b. The result is that you can create a specialized function like multiplyBy2.


    /*
  Default Parameters in Functions
 Scala allows you to assign default values to function parameters, which can be overridden when calling the function.
   */

    def greet(name: String = "World"): String = s"Hello, $name!"

    println(greet()) // Output: Hello, World!
    println(greet("John")) // Output: Hello, John!


    //In this case, the function greet has a default parameter name set to "World".

    /*
  Named Parameters
 Scala allows you to call functions using named parameters, making the code more readable.
   */

    def printDetails(name: String, age: Int): Unit = {
      println(s"Name: $name, Age: $age")
    }

    printDetails(age = 25, name = "Alice") // Output: Name: Alice, Age: 25


    /*
  Function as a First-Class Citizen
  In Scala, functions are first-class citizens, meaning they can be assigned to variables, passed as arguments, or returned from other functions.
   */

    val double = (x: Int) => x * 2

    def operateOnNumber(f: Int => Int, n: Int): Int = f(n)

    println(operateOnNumber(double, 4)) // Output: 8


    /*
  Recursive Functions
  A recursive function is a function that calls itself. In Scala, you must explicitly declare a function as @scala.annotation.tailrec to optimize tail recursion.
   */

    def factorial(n: Int): Int = {
      if (n == 0) 1
      else n * factorial(n - 1)
    }

    println(factorial(5)) // Output: 120


    /*
  Variable-Length Arguments (Varargs)
  Functions in Scala can take a variable number of arguments using the * symbol.
   */

    def sum(numbers: Int*): Int = numbers.sum

    println(sum(1, 2, 3, 4)) // Output: 10

  }

}
