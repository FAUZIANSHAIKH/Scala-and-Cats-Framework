import cats.Monad
import cats.syntax.functor._
import cats.syntax.flatMap._
import cats.instances.option._
import cats.instances.list._
object Monads extends App {
  def sumSquare[F[_]: Monad](a: F[Int], b:F[Int]): F[Int] = a.flatMap(x => b.map(y => x*x + y*y))

  println(sumSquare(Option(3), Option(4)))
  println(sumSquare(List(1,2,3), List(4,5)))

}
