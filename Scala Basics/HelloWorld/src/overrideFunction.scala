trait Pet {
    def speak = println("Yo")
    def comeToMaster():Unit
}
class Cat extends Pet{
  override def speak():Unit = println("meow")
  def comeToMaster():Unit = println("Thats not gonna happen.")
}
val c=new Cat
c.speak
c.comeToMaster