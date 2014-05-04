package week2

object parenthasis {
    //def balance(chars: List[Char]): Boolean = {
      //def isBalanced(a: Char, b: Char): Boolean = {isOpen(a) && isClosed(b)}
      //def isOpen(c: Char) = {c == '('}
      //def isClosed(c: Char) = {c == ')'}
     
      
def balance(chars: List[Char]): Boolean = {
   def isOpen(c: Char) = {c == '('}
   def isClosed(c: Char) = {c == ')'}
   
   def balanced(chars: List[Char], builder: String): Boolean = {
   				
      if (chars.isEmpty)
        builder.isEmpty
   
      else if (isOpen(chars.head))
        balanced(chars.tail, chars.head + builder)
   
      else if (isClosed(chars.head))
        !builder.isEmpty && balanced(chars.tail, builder.tail)
      else
        balanced(chars.tail, builder)
    }
    balanced(chars, "")
  }                                               //> balance: (chars: List[Char])Boolean
 balance("(a(b)dc)".toList)                       //> res0: Boolean = true
 	       
//	  def balanced(chars: List[Char], open: Int): Boolean = {
//	    if (chars.isEmpty) open == 0
//        else if (chars.head == '(') balanced(chars.tail, open + 1)
//        else if (chars.head == ')') open > 0 && balanced(chars.tail, open - 1)
//        else balanced(chars.tail, open)
//        balanced(chars, 0)
//      }
//      balanced(chars, 0)
 
// }


}