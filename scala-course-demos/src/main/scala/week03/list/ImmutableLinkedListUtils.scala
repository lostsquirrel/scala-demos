package week03.list

object ImmutableLinkedListUtils {
  def singleton[T](elem: T) = new ConsList[T](elem, new NilList[T])

  def sample[T](input: List[T], n: Int) = {

    def makeSample(x: List[T], l: ImmutableLinkedList[T], n: Int): ImmutableLinkedList[T] = {
      if (n <= 0) l
      else
        new ConsList[T](x.head, makeSample(x.tail, l, n - 1))

    }
    makeSample(input, new NilList[T](), n)
  }

  def indexOf[T](l: ImmutableLinkedList[T], n: Int): T = {
    def walkIndex(x: ImmutableLinkedList[T], n: Int): T = {
//      println(x.head)
      if (n < 0) throw new IndexOutOfBoundsException()
      else if (n > 0) walkIndex(x.tail, n - 1)
      else x.head
    }
    walkIndex(l, n)
  }
}
