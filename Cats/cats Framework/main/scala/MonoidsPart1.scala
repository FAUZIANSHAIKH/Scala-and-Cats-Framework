import cats.Monoid
import cats.instances.int._
import cats.syntax.semigroup._
object MonoidsPart1 extends App{

  def add(items: List[Int]): Int =
    items.foldLeft(Monoid[Int].empty)(_|+|_)
  println(add(List(4,3)))
}
