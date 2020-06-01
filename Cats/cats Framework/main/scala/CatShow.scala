import cats.Show
import cats.instances.int._
import cats.instances.string._
import cats.syntax.show._
object CatShow extends App{
  case class Cat(name:String, age:Int, color:String)
  implicit val catShow: Show[Cat] = Show.show[Cat] { cat =>
    val name = cat.name.show
    val age = cat.age.show
    val color = cat.color.show
    s"$name is a $age year old $color cat."
  }
  println(Cat("Tom",43,"Blue").show)
}
