package week03.list

class NilList[T] extends ImmutableLinkedList[T] {
  override def isEmpty: Boolean = true

  override def head: T = throw new NoSuchElementException("Nil.head")

  override def tail: ImmutableLinkedList[T] = throw new NoSuchElementException("Nil.tail")

  override def toString: String = "[]"
}
