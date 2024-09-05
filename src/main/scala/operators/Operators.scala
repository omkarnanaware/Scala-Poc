package operators

object Operators {

  /*
  1. Arithmetic Operators:
  +: Addition
  -: Subtraction
  *: Multiplication
  /: Division
  %: Modulus

  2. Relational Operators:
  ==: Equal to
  !=: Not equal to
  >: Greater than
  <: Less than
  >=: Greater than or equal to
  <=: Less than or equal to

  3. Logical Operators:
  &&: Logical AND
  ||: Logical OR
  !: Logical NOT

  4. Bitwise Operators:
  &: Bitwise AND
  |: Bitwise OR
  ^: Bitwise XOR
  ~: Bitwise NOT
  <<: Left shift
  >>: Right shift
  >>>: Unsigned right shift

  5. Assignment Operators:
  =: Simple assignment
  +=: Add and assign
  -=: Subtract and assign
  *=: Multiply and assign
  /=: Divide and assign
  %=: Modulus and assign

  6. Unary Operators:
  +: Unary plus
  -: Unary minus
  !: Logical NOT
  ~: Bitwise NOT

  7. Other Operators:
  ::: Used with lists to prepend elements
  ->: Creates a tuple
  |>: Pipelining (unofficial)
  isInstanceOf: Type checking
  asInstanceOf: Type casting
  ==: Checks structural equality
  eq: Checks referential equality
   */


  // ----------------------------------
  // Arithmetic Operations
  // ----------------------------------
  def arithmeticOps(a: Int, b: Int): Unit = {
    println(s"Addition: ${a + b}")
    println(s"Subtraction: ${a - b}")
    println(s"Multiplication: ${a * b}")
    println(s"Division: ${a / b}")
    println(s"Modulus: ${a % b}")
  }

  // ----------------------------------
  // Relational Operations
  // ----------------------------------
  def relationalOps(a: Int, b: Int): Unit = {
    println(s"Equal: ${a == b}")
    println(s"Not Equal: ${a != b}")
    println(s"Greater than: ${a > b}")
    println(s"Less than: ${a < b}")
    println(s"Greater than or equal: ${a >= b}")
    println(s"Less than or equal: ${a <= b}")
  }

  // ----------------------------------
  // Logical Operations
  // ----------------------------------
  def logicalOps(x: Boolean, y: Boolean): Unit = {
    println(s"AND: ${x && y}")
    println(s"OR: ${x || y}")
    println(s"NOT: ${!x}")
  }

  // ----------------------------------
  // Bitwise Operations
  // ----------------------------------
  def bitwiseOps(a: Int, b: Int): Unit = {
    println(s"Bitwise AND: ${a & b}")
    println(s"Bitwise OR: ${a | b}")
    println(s"Bitwise XOR: ${a ^ b}")
    println(s"Bitwise NOT: ${~a}")
    println(s"Left shift: ${a << 1}")
    println(s"Right shift: ${a >> 1}")
  }

  // ----------------------------------
  // Assignment Operations
  // ----------------------------------
  def assignmentOps(): Unit = {
    var num = 10
    println(s"Initial value: $num")
    num += 5
    println(s"After += : $num")
    num -= 3
    println(s"After -= : $num")
    num *= 2
    println(s"After *= : $num")
    num /= 4
    println(s"After /= : $num")
    num %= 2
    println(s"After %= : $num")
  }

  // ----------------------------------
  // Unary Operations
  // ----------------------------------
  def unaryOps(a: Int): Unit = {
    println(s"Unary plus: ${+a}")
    println(s"Unary minus: ${-a}")
    println(s"Bitwise NOT: ${~a}")
  }

  // ----------------------------------
  // Other Operations
  // ----------------------------------
  def otherOps(): Unit = {
    val list = 1 :: 2 :: 3 :: Nil
    println(s"List with :: : $list")

    val tuple = "Key" -> "Value"
    println(s"Tuple with -> : $tuple")

    println(s"isInstanceOf check: ${10.isInstanceOf[Int]}")
  }

  // Main method to execute all operations
  def main(args: Array[String]): Unit = {
    println("----- Arithmetic Operations -----")
    arithmeticOps(10, 5)

    println("\n----- Relational Operations -----")
    relationalOps(10, 5)

    println("\n----- Logical Operations -----")
    logicalOps(true, false)

    println("\n----- Bitwise Operations -----")
    bitwiseOps(3, 5)

    println("\n----- Assignment Operations -----")
    assignmentOps()

    println("\n----- Unary Operations -----")
    unaryOps(10)

    println("\n----- Other Operations -----")
    otherOps()
  }

}
