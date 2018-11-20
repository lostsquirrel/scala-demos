package week4

object False extends Boolean {
  override def ifThenElse[T](t: => T, e: => T): T = e
}
