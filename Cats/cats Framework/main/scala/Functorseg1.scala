import cats.instances.list._
import cats.Functor
import cats.instances.option._
object Functorseg1 extends App{
  val l = List(1,2,3,4,5)
  Functor[List] .map(l)(_ * 2)
  println(l)
  val l1 = List(Some(1), None, Some(2), Some(3))
  val l2 = Some(9).map(_*2)
  println(l2)
  l1.map(_.map(_ * 2))
  println(l1)
  Functor[List].compose[Option].map(l1)(_ * 2)
  println(l1)
}
