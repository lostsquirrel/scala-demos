package demo.scala.syntax.clazz

class PointD {

  private var _x = 0

  private var _y = 0

  private val bounds = 100

  def x = _x

  def x_=(newValue: Int): Unit = {
    if (newValue < bounds) _x = newValue else printWarning
  }

  def y = _y

  def y_= (newValue: Int): Unit = {
    if (newValue < bounds) _y = newValue else printWarning
  }

  private def printWarning = println("WARNING: out of bounds")

  override def toString: String =
    s"($x, $y)"
}
