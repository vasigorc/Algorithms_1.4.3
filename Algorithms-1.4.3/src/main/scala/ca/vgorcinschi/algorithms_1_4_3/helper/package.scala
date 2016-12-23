package ca.vgorcinschi.algorithms_1_4_3

package object helper {
  def willAdditionOverflow(left: Int, right: Int): Boolean = {
    try {
      Math.addExact(left, right)
      false
    } catch {
      case e: ArithmeticException => true
    }
  }

  def willSubstractionOverflow(left: Int, right: Int): Boolean = {
    try{
      Math.subtractExact(left, right)
      false
    } catch{
      case e: ArithmeticException => true
    }
  }
}