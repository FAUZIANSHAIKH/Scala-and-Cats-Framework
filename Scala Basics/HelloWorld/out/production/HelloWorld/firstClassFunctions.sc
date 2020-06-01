val someNumbers = List(-11, 10, -5, 0, 5, 10)
someNumbers.foreach((x:Int) => println(x))
someNumbers.filter((x:Int) => x>0)
someNumbers.filter(_>0)
val f = (_:Int) + (_:Int)
f(5,10)
def sum(a:Int, b:Int,c:Int)=a+b+c
val b = sum(1,_:Int,3)
b(5)