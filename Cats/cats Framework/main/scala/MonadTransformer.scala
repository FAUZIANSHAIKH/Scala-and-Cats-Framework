import cats.data.OptionT
import cats.instances.list._ // for Monad
import cats.syntax.applicative._ // for pure
object MonadTransformer extends App {
  type ListOption[A] = OptionT[List, A]
  val result1: ListOption[Int] = OptionT(List(Option(10)))
  val result2: ListOption[Int] = 32.pure[ListOption]
  println(result1.flatMap { (x: Int) =>
    result2.map { (y: Int) =>
      x + y
    }
  })
}