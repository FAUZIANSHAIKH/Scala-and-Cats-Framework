import cats.Monoid
import cats.syntax.semigroup._
import cats.instances.option._
import cats.instances.int._
object MonoidsPart2 extends App{
  def add[A](items:List[A])(implicit monoid: Monoid[A]): A =
    items.foldLeft(Monoid[A].empty)(_|+|_)
  println(add(List(Some(1), None, Some(2), None, Some(3))))
}
