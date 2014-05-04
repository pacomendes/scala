package week1

object session {
   def abs(x:Double) = if (x > 0) x else -x       //> abs: (x: Double)Double
	def sqrt(x: Double): Double = {
	  
	  def isGoodEnough(guess: Double): Boolean =
	    if (abs(guess * guess - x) / x < 0.001) true else false
	
	  def improve(guess: Double): Double =
	    return (guess + (x / guess)) / 2
	
	  def sqrtIter(guess: Double): Double =
	    if (isGoodEnough(guess)) guess
	    else sqrtIter(improve(guess))
	  sqrtIter(1)
  }                                               //> sqrt: (x: Double)Double
  sqrt(2)                                         //> res0: Double = 1.4142156862745097
  sqrt(1e-7)                                      //> res1: Double = 3.162477562740737E-4
  sqrt(1e60)                                      //> res2: Double = 1.0000788456669446E30
}