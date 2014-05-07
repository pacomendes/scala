package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1 else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def isOpen(c: Char): Boolean = { c == '(' }
    def isClose(c: Char): Boolean = { c == ')' }

    def trackBalanced(bracketTracker: String, chars: List[Char]): Boolean = {

      if (chars.isEmpty)
        bracketTracker.isEmpty
      else if (isOpen(chars.head))
        trackBalanced(bracketTracker + chars.head, chars.tail)

      else if (isClose(chars.head))
        if (!bracketTracker.isEmpty)
          trackBalanced(bracketTracker.tail, chars.tail)
        else false
      else
        trackBalanced(bracketTracker, chars.tail)
    }
    trackBalanced("", chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    val validChange = 1
    val invalidChange = 0
    def correctChange(balance: Int) = balance == 0
    def excessChange(balance: Int) = balance < 0
    def shortChange(balance: Int) = balance > 0

    def countCombinations(balance: Int, availableChange: List[Int]): Int = {
      if (shortChange(balance) && availableChange.isEmpty)
        invalidChange
      else if (excessChange(balance))
        invalidChange
      else if (correctChange(balance))
        validChange
      else
        countCombinations(balance - availableChange.head, availableChange) + countCombinations(balance, availableChange.tail)
    }
    countCombinations(money, coins)
  }
}
