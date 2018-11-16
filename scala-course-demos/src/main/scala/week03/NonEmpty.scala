package week03

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  override def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(x, left incl x, right)
    else if (x > elem) new NonEmpty(x, left, right incl x)
    else new NonEmpty(x, new Empty, new Empty)

  override def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
}
