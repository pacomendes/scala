package week2

object rational {
  new Rational(10,20)                             //> res0: week2.Rational = 1/2
  //.sub(new Rational(5,7)).sub(new Rational(3,2))
}

class Rational(x: Int, y: Int) {

  private def gcd(a: Int, b: Int): Int = if(b == 0) a else gcd(b, a % b)
  private val g = gcd(x,y)
  	def num = x / g
  	def den = y / g
  	
    
    override def toString = num + "/" + den
    
    def add(other: Rational) = new Rational(
      (num * other.den) + (other.num * den),
      den * other.den)
    def neg = new Rational(num * -1, den)
    def sub(other: Rational) = add(other.neg)

}