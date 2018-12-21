package week03.list

trait ImmutableLinkedList[T] {
  def isEmpty: Boolean
  def head: T
  def tail: ImmutableLinkedList[T]

//  this() = {
//    new NilList[T]
//  }
}
