/*
Importance of Case Class in Scala
A case class in Scala is a special type of class that has several built-in features that make it ideal for data modeling, especially when dealing with immutable data structures. The following are key features and reasons why case classes are important in Scala:

1. Immutability by Default
Case class instances are immutable by default. This means once an instance is created, its values cannot be modified. This is crucial in functional programming and when dealing with distributed computing frameworks like Spark, where immutability is beneficial for parallel processing and avoiding data corruption in concurrent operations.
2. Automatic equals, hashCode, and toString Implementations
Scala automatically generates equals, hashCode, and toString methods for case classes. This makes them perfect for use in collections like sets, maps, or as keys in distributed computing, where comparing and hashing objects is essential.
Example: You can compare two instances of a case class using ==, and they will be compared based on their contents rather than their references (as in Java).
3. Pattern Matching
Case classes support pattern matching natively, which is one of Scala's most powerful features. You can decompose case class instances in match expressions, making them useful for constructing and deconstructing complex data.
Example:
scala
Copy code
case class Person(name: String, age: Int)

val person = Person("John", 30)

person match {
  case Person(name, age) => println(s"Name: $name, Age: $age")
}
4. Concise Syntax for Object Creation
You don't need the new keyword to instantiate a case class. This leads to cleaner and more concise code.
Example:
scala
Copy code
case class Person(name: String, age: Int)

// No need for 'new'
val person = Person("John", 30)
5. Copy Method
Case classes have a built-in copy() method that allows you to create a modified copy of an existing instance while keeping the original instance unchanged.
Example:
scala
Copy code
val person1 = Person("John", 30)
val person2 = person1.copy(age = 31) // Create a new instance with modified age
6. Serialization
Case classes are inherently serializable. This makes them perfect for distributed computing frameworks like Apache Spark where data often needs to be sent over the network to different nodes. Since case classes can be serialized efficiently, they are widely used in Spark applications.
When to Use Case Classes
You can use case classes in various scenarios in Scala development:

1. Modeling Immutable Data
When you need to represent immutable entities (e.g., a Person, Order, or Transaction), case classes are a great choice due to their simplicity and immutability.
2. Data Transformation in Apache Spark
Case classes are often used to represent rows in a DataFrame or RDD in Apache Spark. The schema of the data can be defined using case classes, and data transformations can be performed on them easily.
Example:
scala
Copy code
case class Employee(name: String, salary: Double)

val employees = Seq(Employee("Alice", 50000), Employee("Bob", 45000))
val employeesDF = employees.toDF()
3. Pattern Matching
When building systems that rely on pattern matching, like parsing data structures, implementing algebraic data types (ADTs), or handling different cases in logic flows.
4. Functional Programming
Since functional programming emphasizes immutability, case classes are a natural fit in Scala programs that follow functional programming paradigms.
5. Simple Data Containers
If you need lightweight data containers that support comparison, copying, and serialization (e.g., for use as keys in collections or for inter-process communication), case classes are ideal.
6. Data Transfer Objects (DTOs)
Case classes are commonly used as Data Transfer Objects (DTOs) between different layers of an application, as they provide immutability, serialization, and clean API contracts.
Summary of Case Class Use Cases
Immutability: Best when you need to model immutable data.
Pattern matching: Perfect for scenarios where pattern matching is used.
Apache Spark: Commonly used to represent schema in distributed datasets.
Functional programming: Suited for functional approaches requiring immutability and concise syntax.
Data modeling: Excellent for concise, self-contained data modeling in Scala applications.
 */



package classoperations

class CaseClassDemo {

  case class Student(Id:Int,Name:String)


  def caseClassFunction():List[Student] = {

    val studentList = List(Student(1,"Omkar"),Student(1,"Omkar"),Student(1,"Omkar"))

    studentList

  }


  case class Person(name: String, age: Int)


    def matchPerson(person: Person): String = person match {
      case Person("John", 30) => "Matched John who is 30"
      case Person("Alice", age) => s"Alice is $age years old"
      case Person(name, age) => s"Person's name is $name and age is $age"
    }


      println(matchPerson(Person("John", 30))) // Output: Matched John who is 30
      println(matchPerson(Person("Alice", 25))) // Output: Alice is 25 years old
      println(matchPerson(Person("Bob", 40))) // Output: Person's name is Bob and age is 40




}
