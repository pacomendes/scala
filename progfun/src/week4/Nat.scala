package week4

abstract class Nat {

  def isZero: Boolean
  def predecesor: Nat
  def successor: Nat
  def +(x: Nat): Nat
  def -(x: Nat): Nat
}

object Zero extends Nat {
  def isZero =  true
  def predecesor = throw new Error("Not Less 0")
  def successor = new Succ(this)
  def +(x: Nat) = x
  def -(x: Nat): Nat
  
}

class Succ(n: Nat) extends Nat {
    def isZero =  false
    def predecesor = n
    def successor = new Succ(this)

}