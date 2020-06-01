class Rational(n:Int, d:Int){
  require(d!=0)
  val numer: Int=n
  val denom: Int=d
  override def toString = numer + "/" + denom
  def add(that:Rational): Rational=
    new Rational(
      numer*that.denom+that.numer*denom,
      denom*that.denom
    )
}
val x=new Rational(1,3)
val y=new Rational(2,3)
x.numer
y.denom