import cats.Functor
import cats.instances.all._
import cats.Applicative
//Generic Prgramming
object GenericProgramming extends App{
  def map[F[_],A,B](fa: F[A])(f: A => B)(implicit F: Functor[F]): F[B]={
    F.map(fa)(f)
  }
  println(map(Option(1))(_ * 2))
  println(map(List(1,2,3))(_*3))

 // Lift a function using functor
  def len(input: String): Int = input.length
  val newfunc = Functor[Option].lift(len)
  println(newfunc(Some("Scala")))

  //Applicative
  val a = Some("Mostafa")
  println(Applicative[Option].ap(Some(len _))(a))
  val add: (Int,Int) => Int = _+_
  val b = Some(7)
  val c = Some(9)
  println(Applicative[Option].ap2(Some(add))(c,b))
  println(Applicative[Option].map2(b,c)(add))
}
