package week04.idealized

object False extends Boolean {
  override def ifThenElse[T](t: => T, e: => T): T = e
}