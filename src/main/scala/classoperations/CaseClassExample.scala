package classoperations

case class Person(name: String, age: Int)
case class student(Id:Int,Name:String)

object CaseClassExample {

    def matchPerson(person: Person): String = person match {
      case Person("John", 30) => "Matched John who is 30"
      case Person("Alice", age) => s"Alice is $age years old"
      case Person(name, age) => s"Person's name is $name and age is $age"
    }

  def patternMatchImp(list: List[student]): List[String] = {
    val str = list.map(x => x match {
        case student(1, "Omkar") => s" Student name is Omkar and Id is 1"
        case student(2, "Rohan") => s" Rohan 2"
        case student(id, name) => s" $id , $name"
      })
    str
  }


    def main(args: Array[String]): Unit = {
      println(matchPerson(Person("John", 30))) // Output: Matched John who is 30
      println(matchPerson(Person("Alice", 25))) // Output: Alice is 25 years old
      println(matchPerson(Person("Bob", 40))) // Output: Person's name is Bob and age is 40

      val list = List(student(1,"Omkar"),student(2,"Rohan"),student(100,"ABC"))
      println(patternMatchImp(list))

    }

}
