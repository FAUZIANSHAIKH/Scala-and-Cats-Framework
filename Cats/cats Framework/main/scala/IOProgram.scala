import cats.effect.IO
object IOProgram extends App{
  val program: IO[Unit] =
  for{
    _ <- IO(println("Enter your name: "))
    n <- IO(scala.io.StdIn.readLine)
    _ <- IO(println(s"Hello $n!"))
  } yield()
program.unsafeRunSync()
  ()
}
