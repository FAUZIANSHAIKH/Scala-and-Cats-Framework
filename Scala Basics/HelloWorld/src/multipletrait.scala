trait Speaker {
    def speak(): String
}
trait TailWagger {
  def startTail():Unit
  def stopTail():Unit
}
trait Runner {
  def startRunning():Unit
  def stopRunning():Unit
}

class Dog extends Speaker with TailWagger with Runner {
  def speak(): String = "Woof!"
  def startTail():Unit = println("tail is wagging")
  def stopTail():Unit = println("tail is stopped")
  def startRunning():Unit = println("I'm running")
  def stopRunning():Unit = println("Stopped running")
}
val d = new Dog
println(d.speak)
println("**********")
d.stopRunning