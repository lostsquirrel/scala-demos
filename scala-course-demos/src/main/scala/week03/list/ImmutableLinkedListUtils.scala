package week03.list

object ImmutableLinkedListUtils {
  def singleton[T](elem: T) = new ConsList[T](elem, new NilList[T])

  def sample[T](x: T, n: Int) = {

    def makeSample[T](l: ImmutableLinkedList[T], n: Int) = {
      if (n <= 0) l
      else new ConsList[T](x, l)
    }
    makeSample(new NilList[T](), n)
  }

  def indexOf[T](l: ImmutableLinkedList[T], n: Int): Unit = {
    def walkIndex[T](l: ImmutableLinkedList[T], n: Int): T = {
      if (n < 0) throw IndexOutOfBoundsException
      else if (n > 0) walkIndex(l.tail, n - 1)
      else l.head
    }
    walkIndex(l, n)
  }
}
