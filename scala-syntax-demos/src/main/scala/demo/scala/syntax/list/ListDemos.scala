package demo.scala.syntax.list

object ListDemos {
  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("last of empty list")
    case List(x) => x
    case y :: ys => last(ys)
  }

  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("last of empty list")
    case List(x) => xs
    case y :: ys => y :: init(ys)
  }

  def concat[T](xs: List[T], ys: List[T]) : List[T]= xs match {
    case List() => ys
    case z :: zs => z :: concat(zs, ys)
  }
}
