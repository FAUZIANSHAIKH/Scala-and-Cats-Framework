import cats.Show
import cats.instances.int._
import cats.instances.string._
import cats.syntax.show._
import java.util.Date
object example extends App {
  val showInt: Show[Int]= Show.apply[Int]
  val showString: Show[String] = Show.apply[String]
  println(showInt.show(123))
  val shownInt = 123.show
  println(shownInt)
  val shownString = "abc".show
  println(shownString)
  implicit val dateShow: Show[Date] =
    new Show[Date]{
      def show(date:Date):String =
        s"${date.getTime}ms since the epoch."
}
  println(new Date().show)


  }



