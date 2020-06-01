trait TailWagger {
    def startTail(): Unit
    def stopTail(): Unit
}
class Dog extends TailWagger {
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")
}
val d = new Dog
d.startTail
println("--------")
d.stopTail