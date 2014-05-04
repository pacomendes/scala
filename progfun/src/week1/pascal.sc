package week1

object pascal {
	def pascal(c: Int, r: Int): Int =
    {
//    1
//   1 1
//  1 2 1
// 1 3 3 1
//1 4 6 4 1
    //2,1
    //pascal(1,2) = 2
//    def minCol(col) = if(col < 0) 0 else col
    
  	  if (c == 0 || c == r) 1
    	else (pascal(c-1, r-1) + pascal(c,r-1))
    
    }                                             //> pascal: (c: Int, r: Int)Int
    pascal(2,3)                                   //> res0: Int = 3
}

//1,2 * 2,2