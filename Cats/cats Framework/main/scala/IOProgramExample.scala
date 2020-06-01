import cats.effect.IO
object IOProgramExample extends App {
  val ioa = IO {
    println("This is Simple IO Program")
  }
  val iob = IO {
    println("Example")
  }

  val program: IO[Unit] =
    for {
      _ <- ioa
      _ <- iob
    } yield ()

  program.unsafeRunSync()

  ()
}