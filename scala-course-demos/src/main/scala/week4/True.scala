package week4

object True extends Boolean {
  override def ifThenElse[T](t: => T, e: => T): T = t
}
