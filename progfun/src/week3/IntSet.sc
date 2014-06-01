package week3

object IntSets {
	val t1 = new TreeSet(3, Empty, Empty)     //> t1  : week3.TreeSet = {.3.}
	val t2 = t1 include 5 include 1 include 4 //> t2  : week3.IntSet = {{.1.}3{{.4.}5.}}
}

abstract class IntSet {
  def include(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}

object Empty extends IntSet {

  def include(x: Int): IntSet = new TreeSet(x, Empty, Empty)
  def contains(x: Int): Boolean = false
  def union(other: IntSet) = other
  override def toString() = "."
}

class TreeSet(element: Int, left: IntSet, right: IntSet) extends IntSet {
  def include(x: Int): IntSet = {
  	if(x < element) new TreeSet(element, left include x, right)
  	else if(x > element) new TreeSet(element, left, right include x)
  	else this
  }
  def contains(x: Int): Boolean = {
  	if(x < element) left contains x
  	else if(x > element) right contains x
  	else true
  }
   def union(other: IntSet) = {
     ((left union right) union other) include element
   }
  override def toString() = "{" + left + element + right + "}"
}