package demo.scala.syntax.traints

trait Iterator[A] {
  def hasNext: Boolean
  def next(): A
}
