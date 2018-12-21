package week03.traint

class Square extends Shape with Planar with Movable {
  override def height: Int = 1
  override def width: Int = 2
}
