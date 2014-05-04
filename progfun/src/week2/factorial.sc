package week2

object factorial {
  def factorialFR(x : Int): Int = {
  	if(x == 0) 1 else x * factorialFR(x -1)
  }                                               //> factorialFR: (x: Int)Int
  factorialFR(4)                                  //> res0: Int = 24

 def factorialAcc(x : Int): Int = {
 		def loop(acc:Int,n: Int): Int = {
 		if(n == 0) acc else
 		loop(acc*n, n-1)
 		}
		loop(1,x)
  }                                               //> factorialAcc: (x: Int)Int
  factorialAcc(4)                                 //> res1: Int = 24
}