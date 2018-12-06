package week4
import java.util.NoSuchElementException


object Zero extends Nat{
  override def isZero: Boolean = true

  override def predecessor: Nat = throw Error

  override def +(that: Nat): Nat = that

  override def -(that: Nat): Nat = if (that.isZero) this else throw Error
}
