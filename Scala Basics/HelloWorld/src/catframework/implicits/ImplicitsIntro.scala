package catframework.implicits

object ImplicitsIntro extends App{
  val pair = "Daniel" -> "SSS"
  val intPair = 1 -> 2
  case class Person(name: String){
    def greet = s"Hi, my name is $name!"
  }
  implicit def fromStringToPerson(str: String): Person = Person(str)
  println("Peter".greet)
}
