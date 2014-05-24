package week2

object sum {
   
   def sum(f: Int => Int,a: Int, b: Int): Int = {
        def loop(a: Int, acc: Int): Int = {
          if (a > b) acc
          else loop(a + 1, acc + f(a))
        }
        loop(a, 0)
      }                                           //> sum: (f: Int => Int, a: Int, b: Int)Int
      5 + 5                                       //> res0: Int(10) = 10
      sum(x => x,1,3)                             //> res1: Int = 6
}