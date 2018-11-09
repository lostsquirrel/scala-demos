package demo.scala.syntax.clazz

class PointC(var x: Int = 0, var y: Int = 0) {
  override def toString: String =
    s"($x, $y)"
}