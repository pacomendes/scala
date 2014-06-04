package week4

object expr {
 def show(e: Expr): String = e match {
 	case Number(a) => a
 	case Sum(a,b) => show(a) + " + " + show(b)
 }
}