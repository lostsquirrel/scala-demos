package week04.list

trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]

//  this() = {
//    new NilList[T]
//  }
}
