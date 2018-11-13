package demo.scala.syntax.mixin

abstract class A {
  val message: String
}

class B extends A {
  val message = "I'm an instance of class B extends abstract class A"
}

trait C extends A {
  def loudMessage = message.toUpperCase()
}

class D extends B with C


abstract class AbsIterator {
  type T

  def hasNext: Boolean

  def next(): T
}

class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0

  def hasNext = i < s.length

  def next() = {
    val ch = s charAt i
    i += 1
    ch
  }
}

trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit): Unit = while (hasNext) f(next())
}

class RichStringIter extends StringIterator("Scala") with RichIterator