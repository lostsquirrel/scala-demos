package week03.list

class ConsList[T](val head: T, val tail: ImmutableLinkedList[T]) extends ImmutableLinkedList[T] {
  override def isEmpty: Boolean = false
}
