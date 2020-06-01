object typeClassexample extends App{
  trait Printable[T] {
    def format(value:T): String
  }
  object PrintableInstances{
    implicit val intInstance = new Printable[Int]{
      override def format(value: Int): String = value.toString
    }
    implicit val stringInstances = new Printable[String]{
      override def format(value: String): String = s"-- $value --"
    }
  }
  object PrintableInterface{
    def print[T](value:T)(implicit printable:Printable[T]) = println(printable.format(value))
  }
  import PrintableInstances._
  PrintableInterface.print("Fauzia Shaikh")
}
